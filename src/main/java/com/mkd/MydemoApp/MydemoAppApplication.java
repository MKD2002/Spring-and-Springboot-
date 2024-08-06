package com.mkd.MydemoApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MydemoAppApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(MydemoAppApplication.class, args);
		Aliens obj = context.getBean(Aliens.class);
		obj.build();
	}

}
