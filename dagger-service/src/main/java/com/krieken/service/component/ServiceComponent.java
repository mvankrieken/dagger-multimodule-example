package com.krieken.service.component;

import javax.inject.Singleton;

import com.krieken.service.UserService;
import com.krieken.service.module.ServiceModule;
import dagger.Component;

@Singleton
@Component(modules = {
		ServiceModule.class
})
public interface ServiceComponent {

	UserService userService();
}

