package com.org.abs.factory.postgre;

import com.org.abs.factory.wrapper.Command;

public class PostgreSQLCommand implements Command {

	@Override
	public void execute() {
		System.out.println("Executing PostgreSQL command");
	}

}
