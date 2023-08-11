package com.shivudu.service;

import java.util.List;

import com.shivudu.model.Employee;

public interface EmployeeService {

	public String saveEmployee(Employee employee);

	public List<Employee> findAll();

	public String updateEmployee(Employee employee);

	public String deletebyIdEmployee(Integer id);

	public String deleteAllEmployee();

}
