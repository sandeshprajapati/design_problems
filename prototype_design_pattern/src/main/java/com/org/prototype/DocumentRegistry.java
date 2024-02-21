package com.org.prototype;

import java.util.HashMap;
import java.util.Map;

public class DocumentRegistry {

	private Map<String, DocumentPrototype> prototypes = new HashMap<>();

	// Register a document type in the registry
	public void registerDocument(String type, DocumentPrototype prototype) {
		prototypes.put(type, prototype);
	}

	// Create and return a clone of a document based on its type
	public DocumentPrototype createDocument(String type) {
		if (prototypes.containsKey(type)) {
			return prototypes.get(type).createClone();
		}
		return null;
	}
}
