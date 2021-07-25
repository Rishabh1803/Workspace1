package com.rk.service;

import java.sql.SQLException;
import java.util.List;

import com.rk.bean.Employee;
import com.rk.persistence.EmployeeDao;
import com.rk.persistence.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {

	EmployeeDao dao = new EmployeeDaoImpl();
	@Override
	public List<Employee> getAllEmployees() throws ClassNotFoundException, SQLException {
		return dao.getAllEmployees();
	}

}
