package com.org.abs.factory.mysql;

import com.org.abs.factory.wrapper.Command;
import com.org.abs.factory.wrapper.Connection;
import com.org.abs.factory.wrapper.DatabaseFactory;
import com.org.abs.factory.wrapper.Transaction;

public class MySQLFactory implements DatabaseFactory {

	@Override
	public Connection createConnection() {
		return new MySQLConnection();
	}

	@Override
	public Command createCommand() {
		return new MySQLCommand();
	}

	@Override
	public Transaction createTransaction() {
		return new MYSQLTransaction();
	}

}
