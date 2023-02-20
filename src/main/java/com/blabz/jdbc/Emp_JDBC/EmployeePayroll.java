package com.blabz.jdbc.Emp_JDBC;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeePayroll {
	public static boolean CreatedConnection(String s) {
		return true;

	}

	public static boolean preparedStatement(String name, double salary) {
		Connection conn;

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/payroll_service", "root", "rootroot");
			String s = "update employee_payroll set salary = ? where name=?";
			PreparedStatement ps = conn.prepareStatement(s);
			ps.setDouble(1, salary);
			ps.setString(2, name);
			ps.executeUpdate();
			boolean result = true;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;

	}
}
