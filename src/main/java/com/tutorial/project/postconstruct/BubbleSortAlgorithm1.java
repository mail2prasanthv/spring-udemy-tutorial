package com.tutorial.project.postconstruct;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
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
