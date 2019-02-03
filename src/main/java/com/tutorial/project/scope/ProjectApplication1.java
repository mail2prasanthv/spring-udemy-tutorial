package com.tutorial.project.scope;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.tutorial.project" })
public class ProjectApplication1 {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(ProjectApplication1.class, args);

		BinarySearchImpl1 binarySearchImplBean1 = applicationContext.getBean(BinarySearchImpl1.class);
		BinarySearchImpl1 binarySearchImplBean2 = applicationContext.getBean(BinarySearchImpl1.class);

		System.out.println("----------------");
		System.out.println("Bean 1                 :" + binarySearchImplBean1);
		System.out.println("Bean 1: Sort  Algorithm:" + binarySearchImplBean1.getSortAlgorithm());
		System.out.println("----------------");
		System.out.println("Bean 2                 :" + binarySearchImplBean2);
		System.out.println("Bean 2: Sort  Algorithm:" + binarySearchImplBean2.getSortAlgorithm());
		System.out.println("----------------");

		int found = binarySearchImplBean1.binarySearch(new int[] { 1, 2, 3, 4, 5 }, 2);
		System.out.println("Bean :" + binarySearchImplBean1 + " Result:" + found);
	}
}
