package com.dhruv.dependencyinjectiondemo.controllers;

import com.dhruv.dependencyinjectiondemo.services.GreetingService;

public class SetterInjectionController {

    private GreetingService greetingService;

    String sayHello() {
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}