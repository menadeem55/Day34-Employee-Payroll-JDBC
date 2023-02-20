package com.blabz.jdbc.Emp_JDBC;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeePayroll {
	public static void CreatedConnection() {

		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/payroll_service", "root",
					"rootroot");

			Statement st = conn.createStatement();
			st.execute("select sum(salary) from employee_payroll");
			st.execute("select avg(salary) from employee_payroll");
			st.execute("select min(salary) from employee_payroll");
			st.execute("select count(salary) from employee_payroll");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) throws SQLException {
		CreatedConnection();

	}
}
