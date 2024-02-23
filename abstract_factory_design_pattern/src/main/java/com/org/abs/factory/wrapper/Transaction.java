package com.org.abs.factory.wrapper;

public interface Transaction {

	void begin();

	void commit();

	void rollback();
}
