package com.dhruv.dependencyinjectiondemo.services;

public class GreetingServiceImpl implements   GreetingService {

    public static final String HELLO_GUYZ = "Hello Guyzzz!!!";

    @Override
    public String sayGreeting() {
        return HELLO_GUYZ;
    }
}