package com.shivudu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shivudu.model.Employee;
import com.shivudu.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@PostMapping("/create")
	public String saveEmployee(@RequestBody Employee employee) {
		return service.saveEmployee(employee);
	}

	@GetMapping("/retrive")
	public List<Employee> findAll() {
		return service.findAll();
	}

	@PutMapping("/update")
	public String updateEmployee(@RequestBody Employee employee) {
		return service.updateEmployee(employee);
	}

	@DeleteMapping("/delete/{id}")
	public String deletebyIdEmployee(@PathVariable Integer id) {
		return service.deletebyIdEmployee(id);
	}

	@DeleteMapping("/deleteAll")
	public String deleteAllEmployee() {
		return service.deleteAllEmployee();
	}

}
