package com.tutorial.project.postconstruct;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")
public class QuickSortAlgorithm1 implements SortAlgorithm1 {

	public void sort(int[] numbers) {
		System.out.println("Inside QuickSort Implemention");
	}

}
