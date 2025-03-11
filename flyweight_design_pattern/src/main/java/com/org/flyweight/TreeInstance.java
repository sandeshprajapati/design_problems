package com.org.flyweight;

//Unshared Concrete Flyweight (unique) class
public class TreeInstance implements Tree {

	private final TreeType treeType;
	private final int x;
	private final int y;

	public TreeInstance(TreeType treeType, int x, int y) {
		this.treeType = treeType;
		this.x = x;
		this.y = y;
	}

	@Override
	public void render(int x, int y) {
		treeType.render(x, y); // Delegating rendering to the shared TreeType
	}
}
