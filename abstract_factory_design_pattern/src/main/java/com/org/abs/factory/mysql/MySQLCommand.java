package com.org.abs.factory.mysql;

import com.org.abs.factory.wrapper.Command;

public class MySQLCommand implements Command {

	@Override
	public void execute() {
		System.out.println("Executing MySQL command");
	}

}
