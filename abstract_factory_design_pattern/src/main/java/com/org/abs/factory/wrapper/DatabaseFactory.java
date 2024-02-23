package com.org.abs.factory.wrapper;

public interface DatabaseFactory {
	
	Connection createConnection();

	Command createCommand();

	Transaction createTransaction();
}
