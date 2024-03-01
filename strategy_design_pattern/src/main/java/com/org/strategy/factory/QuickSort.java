package com.org.strategy.factory;

import java.util.Arrays;
import java.util.Collections;

public class QuickSort implements SortingStrategy {

	@Override
	public void sort(Integer[] array) {
		Collections.sort(Arrays.asList(array));
		System.out.println("Sort the array using using quick sort : " + Arrays.toString(array));
	}

}
