package com.tutorial.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.tutorial.project.loose.coupling.BinarySearchImpl;

@SpringBootApplication
@ComponentScan(basePackages = { "com.tutorial.project" })
public class ProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(ProjectApplication.class, args);

		BinarySearchImpl binarySearchImplBean1 = applicationContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl binarySearchImplBean2 = applicationContext.getBean(BinarySearchImpl.class);

		System.out.println("Object 1:" + binarySearchImplBean1);
		System.out.println("Object 2:" + binarySearchImplBean2);

		int found = binarySearchImplBean1.binarySearch(new int[] { 1, 2, 3, 4, 5 }, 2);
		System.out.println("Bean :" + binarySearchImplBean1 + " Result:" + found);

	}
}
