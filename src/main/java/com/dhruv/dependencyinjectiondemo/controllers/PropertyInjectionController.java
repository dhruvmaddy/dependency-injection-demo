package com.dhruv.dependencyinjectiondemo.controllers;

import com.dhruv.dependencyinjectiondemo.services.GreetingService;

public class PropertyInjectionController {

    public GreetingService greetingService;

    String sayHello () {
        return greetingService.sayGreeting();
    }
}