package com.rk.service;

import java.sql.SQLException;
import java.util.List;

import com.rk.bean.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployees() throws ClassNotFoundException, SQLException;
}