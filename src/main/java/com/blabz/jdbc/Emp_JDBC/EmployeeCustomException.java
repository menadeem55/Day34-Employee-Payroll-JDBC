package com.blabz.jdbc.Emp_JDBC;

public class EmployeeCustomException extends Exception {
	public EmployeeCustomException(String Invalid_Input) {
		super(Invalid_Input);
	}

}
