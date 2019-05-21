package com.dhruv.dependencyinjectiondemo.controllers;

import com.dhruv.dependencyinjectiondemo.services.GreetingService;

public class ConstructorInjectionController {

    private GreetingService greetingService;

    public ConstructorInjectionController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    String sayHello() {
        return greetingService.sayGreeting();
    }
}