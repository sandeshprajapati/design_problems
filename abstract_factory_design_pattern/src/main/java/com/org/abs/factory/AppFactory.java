package com.org.abs.factory;

import com.org.abs.factory.mysql.MySQLFactory;
import com.org.abs.factory.postgre.PostgreSQLFactory;
import com.org.abs.factory.wrapper.DatabaseFactory;

public class AppFactory {

	DatabaseFactory getFactory(String type) {
		if ("MYSQL".equals(type)) {
			return new MySQLFactory();
		} else if ("POSTGRE".equals(type)) {
			return new PostgreSQLFactory();
		}
		return null;
	}

}
