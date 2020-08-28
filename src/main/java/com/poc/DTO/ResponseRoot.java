package com.poc.DTO;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseRoot {
	@JsonProperty("variable-instance")
	public List<VariableInstance> variableInstance;
}
