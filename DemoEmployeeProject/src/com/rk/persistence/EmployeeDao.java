package com.rk.persistence;

import java.sql.SQLException;
import java.util.List;

import com.rk.bean.Employee;

public interface EmployeeDao {
	List<Employee> getAllEmployees() throws ClassNotFoundException, SQLException;
}