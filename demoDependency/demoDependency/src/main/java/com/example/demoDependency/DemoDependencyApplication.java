package com.example.demoDependency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoDependencyApplication {

	public static void main(String[] args) {
//		Dev a= new Dev();
//		a.print();
		//If we don't have to use traditional way and stuff we have to use the "ApplicationContext" class.
		ApplicationContext context = SpringApplication.run(DemoDependencyApplication.class, args);
		Dev obj = context.getBean(Dev.class);
		obj.print();
	}

}
