package com.org.prototype;

public class Client {

	public static void main(String[] args) {
		// Create a Document Registry

		DocumentRegistry documentRegistry = new DocumentRegistry();

		documentRegistry.registerDocument("Invoice", new Invoice("Excel"));
		documentRegistry.registerDocument("Report", new Report("PDF"));

		// Create and display documents

		DocumentPrototype invoiceClone = documentRegistry.createDocument("Invoice");

		if (invoiceClone != null) {
			invoiceClone.display();
		}

		DocumentPrototype reportClone = documentRegistry.createDocument("Report");
		if (reportClone != null) {
			reportClone.display();
		}

	}

}
