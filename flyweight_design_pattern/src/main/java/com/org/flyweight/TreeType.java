package com.org.flyweight;

public class TreeType implements Tree {

	private final String texture;
	private final String color;

	public TreeType(String texture, String color) {
		this.texture = texture;
		this.color = color;
	}

	@Override
	public void render(int x, int y) {
		System.out.println("Rendering a " + color + " tree with " + texture + " texture at (" + x + ", " + y + ")");
	}

}
