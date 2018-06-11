package com.prodevans.project.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prodevans.project.dao.EmployeeDao;
import com.prodevans.project.dto.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private static final Logger logger = LoggerFactory.getLogger(EmployeeServiceImpl.class);

	@Autowired
	private EmployeeDao employee_dao;
	
	public void setEmployee_dao(EmployeeDao employee_dao) {
		this.employee_dao = employee_dao;
	}

	@Override
	public Integer insertEmployee(Employee emp) {
		return this.employee_dao.insertEmployee(emp);
	}

	@Override
	public Integer updateEmployee(Employee emp) {
		return this.employee_dao.updateEmployee(emp);
	}

	@Override
	public Integer deleteEmployee(Integer employee_id) {
		return this.employee_dao.deleteEmployee(employee_id);
	}

	@Override
	public List<Employee> getEmployees() {
		return this.employee_dao.getEmployees();
	}

	@Override
	public Employee getEmployeeById(Integer employee_id) {
		return this.employee_dao.getEmployeeById(employee_id);
	}

}
