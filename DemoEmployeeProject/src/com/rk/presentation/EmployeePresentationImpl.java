package com.rk.presentation;

import java.sql.SQLException;
import java.util.List;

import com.rk.bean.Employee;
import com.rk.service.EmployeeService;
import com.rk.service.EmployeeServiceImpl;

public class EmployeePresentationImpl implements EmployeePresentation {

	EmployeeService service = new EmployeeServiceImpl();
	@Override
	public void showMenu() {
		System.out.println("Welcome to the employee management project");
		System.out.println("0. Exit");
		System.out.println("1. To show all employees");
		System.out.print("\nEnter Your Choice: ");
	}

	@Override
	public void selectOption(int choice) {
		switch(choice) {
		case 0: System.out.println("Thank you for using Employee Management System!");
				System.exit(0);
				break;
		case 1: System.out.println("List of all Employees: ");
			List<Employee> list = null;
			try {
				list = service.getAllEmployees();
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
				for(Employee emp : list) {
					System.out.println(emp);
				}
				break;
		default: System.out.println("Invalid Choice");
		}
	}
}