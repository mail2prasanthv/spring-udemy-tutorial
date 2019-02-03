package com.tutorial.project.loose.coupling;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
public class BubbleSortAlgorithm implements SortAlgorithm {

	public void sort(int[] numbers) {
		System.out.println("Inside BubbleSortAlgorithm Implemention");
	}

}
