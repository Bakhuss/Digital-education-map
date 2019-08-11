package org.doit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//dev class
@SpringBootApplication
//@ComponentScan(basePackages = "org.doit.config.*")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
