package com.dhruv.dependencyinjectiondemo.controllers;

import com.dhruv.dependencyinjectiondemo.services.GreetingServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SetterInjectionControllerTest {

    private SetterInjectionController setterInjectionController;

    @Before
    public void setUp() throws Exception {
        this.setterInjectionController = new SetterInjectionController();
        this.setterInjectionController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception {
        Assert.assertEquals(GreetingServiceImpl.HELLO_GUYZ, setterInjectionController.sayHello());
    }
}