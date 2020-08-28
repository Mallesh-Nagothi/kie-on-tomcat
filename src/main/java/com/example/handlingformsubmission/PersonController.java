package com.example.handlingformsubmission;

import java.util.List;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

import com.poc.DTO.Application;
import com.poc.DTO.ApplicationRoot;
import com.poc.DTO.ComPocApplication;
import com.poc.DTO.ResponseRoot;
import com.poc.DTO.VariableInstance;

@Controller
public class PersonController {
	
	private final String EXECUTE_PROCESS_URL = "http://localhost:8383/kie-server/services/rest/server/containers/";
	private final String EVALUATION_OUTCOME_URL = "http://localhost:8383/kie-server/services/rest/server/queries/processes/instances/";

	@GetMapping("/person")
	public String personForm(Model model) {
		model.addAttribute("person", new Person());
		return "person";
	}

	@PostMapping("/person")
	public String personSubmit(@ModelAttribute Person person, Model model) {
		model.addAttribute("person", this.callKIEServer(person));
		return "loanresult";
	}
	
	private Person callKIEServer(Person person) {
		Integer instanceId = this.executeProcess(person);
		return this.getEvaluatedOutcome(instanceId, person);
	}
	
	private Person getEvaluatedOutcome(Integer instanceId, Person person) {
		String targetURL = EVALUATION_OUTCOME_URL + instanceId + "/variables/instances/application";
		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<?> httpEntity = new HttpEntity<Object>(this.getAuthInfo());
		ResponseEntity<ResponseRoot> response = restTemplate.exchange(targetURL, HttpMethod.GET, httpEntity, ResponseRoot.class);
		List<VariableInstance> responses = response.getBody().variableInstance;
		if(responses != null && responses.size() > 0) {
			person.setStatus(responses.get(0).value);
		}
		return person;
	}
	
	private Integer executeProcess(Person person) {
		
		ComPocApplication input = new ComPocApplication();
		input.applicantAge = person.getAge();
		input.applicantGender = person.getGender();
		
		Application app = new Application();
		app.Application = input;
		
		ApplicationRoot toGo = new ApplicationRoot();
		toGo.application = app;
		
		RestTemplate restTemplate1 = new RestTemplate();
		restTemplate1.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
		HttpEntity<Object> request1 = new HttpEntity<Object>(toGo, this.getAuthInfo());
		
		String kieProcessEvaluationUrl
		  = EXECUTE_PROCESS_URL + person.getContainerId() + "/processes/" + person.getProcessName() + "/instances";
		Integer instanceId = restTemplate1.postForObject(kieProcessEvaluationUrl, request1, Integer.class);
		return instanceId;
	}
	
	private MultiValueMap<String, String> getAuthInfo() {
		String plainCreds = "serveruser:my.s3cr3t.pass";
		byte[] plainCredsBytes = plainCreds.getBytes();
		byte[] base64CredsBytes = Base64.encodeBase64(plainCredsBytes);
		String base64Creds = new String(base64CredsBytes);

		//HttpHeaders headers = new HttpHeaders();
		MultiValueMap<String, String> headers = new LinkedMultiValueMap<String, String>();
		headers.add("Authorization", "Basic " + base64Creds);
		headers.add("Content-Type", "application/json");
		return headers;
	}
	
}

