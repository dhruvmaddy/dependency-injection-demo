
package com.dhruv.dependencyinjectiondemo.controllers;

import com.dhruv.dependencyinjectiondemo.services.GreetingServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PropertyInjectedControllerTest {

    private PropertyInjectionController propertyInjectionController;

    @Before
    public void setUp() throws Exception {
        this.propertyInjectionController = new PropertyInjectionController();
        this.propertyInjectionController.greetingService = new GreetingServiceImpl();
    }

    @Test
    public void testGreeting() throws Exception {
        Assert.assertEquals(GreetingServiceImpl.HELLO_GUYZ, propertyInjectionController.sayHello());
    }
}
