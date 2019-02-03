package com.tutorial.project.loose.coupling;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")
public class QuickSortAlgorithm implements SortAlgorithm {

	public void sort(int[] numbers) {
		System.out.println("Inside QuickSort Implemention");
	}

}
