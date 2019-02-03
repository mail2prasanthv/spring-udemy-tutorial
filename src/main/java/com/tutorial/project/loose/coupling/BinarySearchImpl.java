package com.tutorial.project.loose.coupling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {

	@Autowired
	@Qualifier("bubble")
	private SortAlgorithm sortAlgorithm;

	public int binarySearch(int[] numbers, int numberTobeSearched) {
		// To perform Binary search, first numbers should be sorted.
		// There are 2 algorithms available to perform Sorting
		// 1. Quick Sort
		// 2. Bubble Sort
		sortAlgorithm.sort(numbers);

		return 3;

	}
}
