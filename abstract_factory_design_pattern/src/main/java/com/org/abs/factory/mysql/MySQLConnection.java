package com.org.abs.factory.mysql;

import com.org.abs.factory.wrapper.Connection;

public class MySQLConnection implements Connection {

	@Override
	public void connect() {
		System.out.println("Connected to MySQL database");
	}

	@Override
	public void close() {
		System.out.println("Close MySQL connection");
	}

}
