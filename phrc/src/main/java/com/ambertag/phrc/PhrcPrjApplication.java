package com.ambertag.phrc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.ambertag.phrc")
public class PhrcPrjApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhrcPrjApplication.class, args);
		System.out.println("Project Phrc started...");
	}

}
