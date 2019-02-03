package com.tutorial.project.external.property;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@ComponentScan(basePackages = { "com.tutorial.project.external.property" })
@PropertySource("classpath:external.properties")
public class ProjectApplication1 {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(ProjectApplication1.class, args);

		ExternalPropertyService extService = applicationContext.getBean(ExternalPropertyService.class);
		System.out.println("From External File:" + extService.getExtUrl());

	}
}
