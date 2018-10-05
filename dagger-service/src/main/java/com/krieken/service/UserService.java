package com.krieken.service;

import javax.inject.Inject;

public class UserService {

	private HelloWorldService service;
	
	@Inject
	public UserService(HelloWorldService service) {
		this.service = service;
	}
	
	public String helloUser(String name) {
		return String.format("%s , %s", service.helloWorld(),name);
	}
}
