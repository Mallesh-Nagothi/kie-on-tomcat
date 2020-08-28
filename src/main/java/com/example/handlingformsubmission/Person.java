/**
 * 
 */
package com.example.handlingformsubmission;

/**
 * @author kieuser
 *
 */
public class Person {
	
	private int id;
	private String name;
	private String gender;
	private int age;
	private String status;
	
	//Container Id for the KIE server
	private String containerId;
	
	//Process name
	private String processName;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getContainerId() {
		return containerId;
	}
	public void setContainerId(String containerId) {
		this.containerId = containerId;
	}
	public String getProcessName() {
		return processName;
	}
	public void setProcessName(String processName) {
		this.processName = processName;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", status=" + status
				+ ", containerId=" + containerId + ", processName=" + processName + "]";
	}
}
