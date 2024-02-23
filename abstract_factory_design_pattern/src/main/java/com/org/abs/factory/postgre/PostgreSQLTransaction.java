package com.org.abs.factory.postgre;

import com.org.abs.factory.wrapper.Transaction;

public class PostgreSQLTransaction implements Transaction {

	@Override
	public void begin() {
		System.out.println("Starting PostgreSQL transaction");
	}

	@Override
	public void commit() {
		System.out.println("Committing PostgreSQL transaction");
	}

	@Override
	public void rollback() {
		System.out.println("Rolling back PostgreSQL transaction");
	}

}
