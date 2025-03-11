package com.org.flyweight;

public class Client {

	public static void main(String[] args) {
		TreeType pineTree = TreeFactory.getTreeType("pine", "green");
		TreeType oakTree = TreeFactory.getTreeType("oak", "brown");

		TreeInstance tree1 = new TreeInstance(pineTree, 10, 20);
		TreeInstance tree2 = new TreeInstance(oakTree, 30, 40);
		TreeInstance tree3 = new TreeInstance(pineTree, 50, 60);

		tree1.render(10, 20);
		tree2.render(30, 40);
		tree3.render(50, 60);
	}

}
