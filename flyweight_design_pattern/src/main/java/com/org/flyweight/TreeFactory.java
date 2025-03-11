package com.org.flyweight;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
	private static final Map<String, TreeType> treeTypes = new HashMap<>();

	public static TreeType getTreeType(String texture, String color) {
		String key = texture + "_" + color;
		return treeTypes.computeIfAbsent(key, k -> new TreeType(texture, color));
	}
}
