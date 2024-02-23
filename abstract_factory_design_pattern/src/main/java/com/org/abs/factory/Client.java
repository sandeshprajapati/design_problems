package com.org.abs.factory;

import com.org.abs.factory.wrapper.Command;
import com.org.abs.factory.wrapper.Connection;
import com.org.abs.factory.wrapper.DatabaseFactory;
import com.org.abs.factory.wrapper.Transaction;

public class Client {

	public static void main(String[] args) {

		AppFactory factory = new AppFactory();
		
		DatabaseFactory mysqlDBFactory = factory.getFactory("MYSQL");
		Connection mysqlConnection = mysqlDBFactory.createConnection();
		Command mysqlCommand = mysqlDBFactory.createCommand();
		Transaction mysqlTransaction = mysqlDBFactory.createTransaction();
		try {
			mysqlConnection.connect();
			mysqlTransaction.begin();
			mysqlCommand.execute();
			mysqlTransaction.commit();
			mysqlConnection.close();
		} catch (Exception e) {
			mysqlConnection.close();
		}

		DatabaseFactory postgreDBFactory = factory.getFactory("POSTGRE");
		Connection postgreConnection = postgreDBFactory.createConnection();
		Command postgreCommand = postgreDBFactory.createCommand();
		Transaction postgreTransaction = postgreDBFactory.createTransaction();
		try {
			postgreConnection.connect();
			postgreTransaction.begin();
			postgreCommand.execute();
			postgreTransaction.commit();
			postgreConnection.close();
		} catch (Exception e) {
			postgreConnection.close();
		}
	}
}
