package com.org.strategy.factory;

public class QuickSortFactory implements SortingStrategyFactory {

	@Override
	public SortingStrategy createSortingStrategy() {
		return new QuickSort();
	}

}
