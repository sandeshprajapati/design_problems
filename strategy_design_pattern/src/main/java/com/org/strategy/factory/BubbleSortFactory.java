package com.org.strategy.factory;

public class BubbleSortFactory implements SortingStrategyFactory {

	@Override
	public SortingStrategy createSortingStrategy() {
		return new BubbleSort();
	}

}
