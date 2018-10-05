package com.krieken.adapter;

import com.krieken.adapter.component.DaggerServiceComponent;
import com.krieken.service.component.ServiceComponent;

public class Main {

	public static void main(String[] args) {
        ServiceComponent someComponent = DaggerServiceComponent.builder().build();
        System.out.println(someComponent.userService().helloUser("Reader"));
	}

}
