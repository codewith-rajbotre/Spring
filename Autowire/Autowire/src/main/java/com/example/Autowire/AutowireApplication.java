package com.example.Autowire;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AutowireApplication {

	public static void main(String[] args) {


		ApplicationContext context = SpringApplication.run(AutowireApplication.class, args);
		Dev obj = context.getBean(Dev.class);
		obj.build();
	}

}
