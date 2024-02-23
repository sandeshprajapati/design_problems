package com.org.abs.factory.postgre;

import com.org.abs.factory.wrapper.Connection;

public class PostgreSQLConnection implements Connection {

	@Override
	public void connect() {
		System.out.println("Connected to PostgreSQL database");

	}

	@Override
	public void close() {
		System.out.println("Close PostgreSQL connection");
	}

}
