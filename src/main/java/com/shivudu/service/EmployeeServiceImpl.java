package com.shivudu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shivudu.model.Employee;
import com.shivudu.repo.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepo repository;
	
	@Override
	public String saveEmployee(Employee employee) {
		repository.save(employee);
		return "Employee Record Saved Successfully";
	}

	@Override
	public List<Employee> findAll() {
		return repository.findAll();
	}

	@Override
	public String updateEmployee(Employee employee) {
		repository.save(employee);
		return "Employee Record updated Successfully";
	}

	@Override
	public String deletebyIdEmployee(Integer id) {
		repository.deleteById(id);
		return "Employee Record Deleted Successfully";
	}

	@Override
	public String deleteAllEmployee() {
		repository.deleteAll();
		return "All Employees Records Deleted Successfully";
	}

}
