package com.org.abs.factory.postgre;

import com.org.abs.factory.wrapper.Command;
import com.org.abs.factory.wrapper.Connection;
import com.org.abs.factory.wrapper.DatabaseFactory;
import com.org.abs.factory.wrapper.Transaction;

public class PostgreSQLFactory implements DatabaseFactory {

	@Override
	public Connection createConnection() {
		return new PostgreSQLConnection();
	}

	@Override
	public Command createCommand() {
		return new PostgreSQLCommand();
	}

	@Override
	public Transaction createTransaction() {
		return new PostgreSQLTransaction();
	}

}
