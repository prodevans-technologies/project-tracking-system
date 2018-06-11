package com.prodevans.project.dao;

import java.util.List;

import com.prodevans.project.dto.Employee;

public interface EmployeeDao {
	Integer insertEmployee(Employee emp);
	Integer updateEmployee(Employee emp);
	Integer deleteEmployee(Integer employee_id);
	List<Employee> getEmployees();
	Employee getEmployeeById(Integer employee_id);
}
