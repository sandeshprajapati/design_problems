package com.org.strategy.factory;

public class Client {

	public static void main(String[] args) {
		SortingContext bubbleSortContext = new SortingContext(new BubbleSortFactory());
		Integer[] array1 = { 5, 2, 9, 1, 5, 6 };
		bubbleSortContext.performSort(array1);

		// Using the Quick Sort strategy
		SortingContext quickSortContext = new SortingContext(new QuickSortFactory());
		Integer[] array2 = { 8, 3, 1, 7, 9, 5 };
		quickSortContext.performSort(array2);
	}

}
