package com.educandoweb.course.services.exceptions;

import org.hibernate.boot.model.relational.Database;

public class DataBaseException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public DataBaseException(String msg) {
		super(msg);
	}
}
