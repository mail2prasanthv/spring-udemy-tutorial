package com.tutorial.project.cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class BinarySearchImpl1 {

	@Inject
	private SortAlgorithm1 sortAlgorithm;

	public SortAlgorithm1 getSortAlgorithm() {
		return sortAlgorithm;
	}

	public int binarySearch(int[] numbers, int numberTobeSearched) {
		// To perform Binary search, first numbers should be sorted.
		// There are 2 algorithms available to perform Sorting
		// 1. Quick Sort
		// 2. Bubble Sort
		sortAlgorithm.sort(numbers);

		return 3;

	}
}
