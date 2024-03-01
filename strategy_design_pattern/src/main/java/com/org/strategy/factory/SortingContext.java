package com.org.strategy.factory;

public class SortingContext {
	private SortingStrategy sortingStrategy;

	public SortingContext(SortingStrategyFactory strategyFactory) {
		this.sortingStrategy = strategyFactory.createSortingStrategy();
	}

	public void setSortingStrategy(SortingStrategyFactory strategyFactory) {
		this.sortingStrategy = strategyFactory.createSortingStrategy();
	}

	public void performSort(Integer[] array) {
		sortingStrategy.sort(array);
	}
}
