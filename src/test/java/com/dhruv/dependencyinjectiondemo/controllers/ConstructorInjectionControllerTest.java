package com.dhruv.dependencyinjectiondemo.controllers;

import com.dhruv.dependencyinjectiondemo.services.GreetingServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ConstructorInjectionControllerTest {

    private ConstructorInjectionController constructorInjectionController;

    @Before
    public void setUp() throws Exception  {
        this.constructorInjectionController = new ConstructorInjectionController(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception {
        Assert.assertEquals(GreetingServiceImpl.HELLO_GUYZ, constructorInjectionController.sayHello());
    }
}