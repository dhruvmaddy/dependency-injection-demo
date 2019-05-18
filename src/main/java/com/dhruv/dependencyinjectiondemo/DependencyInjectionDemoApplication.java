package com.dhruv.dependencyinjectiondemo;

import ch.qos.logback.core.db.dialect.MySQLDialect;
import com.dhruv.dependencyinjectiondemo.controllers.ConstructorInjectionController;
import com.dhruv.dependencyinjectiondemo.controllers.MyController;
import com.dhruv.dependencyinjectiondemo.controllers.PropertyInjectionController;
import com.dhruv.dependencyinjectiondemo.controllers.SetterInjectionController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionDemoApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(DependencyInjectionDemoApplication.class, args);

        MyController controller = (MyController) applicationContext.getBean("myController");

        //controller.hello();
        System.out.println(controller.hello());
        System.out.println(applicationContext.getBean(PropertyInjectionController.class).sayHello());
        System.out.println(applicationContext.getBean(SetterInjectionController.class).sayHello());
        System.out.println(applicationContext.getBean(ConstructorInjectionController.class).sayHello());
    }

}
