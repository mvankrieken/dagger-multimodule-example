package com.krieken.service.module;

import javax.inject.Singleton;

import com.krieken.service.HelloWorldService;
import com.krieken.service.UserService;

import dagger.Module;
import dagger.Provides;

@Module
public class ServiceModule {

	@Provides @Singleton
	public HelloWorldService providerHelloWorldService() {
		return new HelloWorldService();
	}
	
	@Provides @Singleton
	public UserService providerUserService(HelloWorldService service) {
		return new UserService(service);
	}
}

