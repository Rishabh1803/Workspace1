package com.rk.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.rk.bean.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public List<Employee> getAllEmployees() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Muskan", "root", "$$Rishabh98$$");
		PreparedStatement statement = connection.prepareStatement("select * from Employee");
		ResultSet set = statement.executeQuery();
		List<Employee> list = new ArrayList<Employee>();
		while(set.next()) {
			Employee emp = new Employee();
			emp.setId(set.getInt("id"));
			emp.setName(set.getString("title"));
			emp.setSalary(set.getInt("salary"));
			list.add(emp);
		}
		return list;
	}
}