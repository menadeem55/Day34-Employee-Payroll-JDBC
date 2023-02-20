package com.blabz.jdbc.Emp_JDBC;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeePayroll {
	public static void CreatedConnection() {

		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/payroll_service", "root",
					"rootroot");
			String s = "select * from employee_payroll";
			PreparedStatement ps = conn.prepareStatement(s);
			ResultSet result = ps.executeQuery();

			while (result.next()) {
				int id = result.getInt(1);
				String name = result.getString(2);
				String gender = result.getString(3);
				Double salary = result.getDouble(4);
				String date = result.getString(5);
				System.out.println("id:- " + id + " Name:- " + name + " Gender:- " + " | " + " Salary:- " + salary
						+ " Date:- " + date);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) throws SQLException {
		CreatedConnection();

	}
}
