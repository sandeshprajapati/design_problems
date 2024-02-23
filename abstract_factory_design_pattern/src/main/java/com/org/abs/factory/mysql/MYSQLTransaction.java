package com.org.abs.factory.mysql;

import com.org.abs.factory.wrapper.Transaction;

public class MYSQLTransaction implements Transaction {

	@Override
	public void begin() {
		System.out.println("Starting MySQL transaction");
	}

	@Override
	public void commit() {
		System.out.println("Committing MySQL transaction");
	}

	@Override
	public void rollback() {
		System.out.println("Rolling back MySQL transaction");
	}

}
