package com.tutorial.project.tight.coupling;

public class BinarSearchImpl {

	
	public int binarySearch(int [] numbers, int numberTobeSearched) {
	// To perform Binary search, first numbers should be sorted. 
	// There are 2 algorithms available to perform Sorting
		//1.	Quick Sort
		//2.	Bubble Sort
	BubbleSortAlgorithm bSort= new BubbleSortAlgorithm();
	bSort.sort(numbers);
				//or
	QuickSortAlgorithm qSort= new QuickSortAlgorithm();
	qSort.sort(numbers);
	
	return 3;
	
	}
}
