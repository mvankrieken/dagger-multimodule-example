package com.krieken.service;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HelloWorldService {

	SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");
	
	public String helloWorld() {
		return String.format("Hello world on %s", dateFormat.format(new Date()));
	}
}
