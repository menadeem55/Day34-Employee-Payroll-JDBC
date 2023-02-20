package com.blabz.jdbc.Emp_JDBC;

import static org.junit.Assert.assertEquals;
import java.sql.SQLException;
import org.junit.Test;
import junit.framework.Assert;

public class EmployeePayrollQueryTest {
	@Test
	public void UpdateQueryTest() {
		EmployeePayroll object = new EmployeePayroll();
		String s = "update employee_payroll set salary = 450000.55 where name = 'Bill'";
		Assert.assertEquals(true, EmployeePayroll.CreatedConnection(s));

	}

	public void checkUpdateQuery() throws SQLException {
		EmployeePayroll object = new EmployeePayroll();
		assertEquals(true, EmployeePayroll.preparedStatement("Bill", 450000.55));
	}
}
