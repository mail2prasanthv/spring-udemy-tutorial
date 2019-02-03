package com.tutorial.project.external.property;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Named;

import org.springframework.context.annotation.Primary;

@Named
@Primary
public class BubbleSortAlgorithm1 implements SortAlgorithm1 {

	public void sort(int[] numbers) {
		System.out.println("Inside BubbleSortAlgorithm Implemention");
	}

	@PostConstruct
	public void postConstructMethod() {
		System.out.println("Inside @PostConstruct  method");
	}

	@PreDestroy
	public void preDestroyMethod() {
		System.out.println("Inside @PreDestroy  method");
	}

}
