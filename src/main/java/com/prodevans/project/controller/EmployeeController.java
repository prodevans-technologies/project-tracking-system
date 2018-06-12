package com.prodevans.project.controller;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.prodevans.project.dto.Employee;
import com.prodevans.project.service.EmployeeService;

@Controller
@RequestMapping(value="/employee")
public class EmployeeController {

	private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);
	
	@Autowired
	private EmployeeService employee_service;
	
	public void setEmployee_service(EmployeeService employee_service) {
		this.employee_service = employee_service;
	}

	/**
	 * This method will map Get request to Employee
	 * @param model
	 * @return Employee
	 */
	@RequestMapping(value = {"","/"}, method = RequestMethod.GET)
	public String getEmployees(Model model, @RequestParam(name="message", required= false)String message) {
		logger.info("Welcome to Employee-Controller");
		// Getting data from the Service
		List<Employee> employees =  employee_service.getEmployees();
		model.addAttribute("employees",employees);
		model.addAttribute("message", message);
		return "employee-list";
	}

	@RequestMapping(value = "/create-employee", method = RequestMethod.GET)
	public String createEmployee(Model model,@RequestParam(name="message", required= false)String message) {
		logger.info("Welcome to Employee-Controller");
		
		// Message 
		model.addAttribute("message", message);
		
		//Add object for employee
		Employee emp = new Employee();
		emp.setJoin_date(new Date());
		model.addAttribute("employee_object", emp);
		
		return "employee";
	}
	
	@RequestMapping(value = "/create-employee", method = RequestMethod.POST)
	public String createEmployeePOST(Model model, @ModelAttribute(name="employee_object")Employee employee ) {
		logger.info("Welcome to Employee post");
		// Calling the save employee method
		int result = employee_service.insertEmployee(employee);
		
		if(result > 0) {
			model.addAttribute("message", "successful");
		}else {
			model.addAttribute("message", "error");
		}
		return "redirect:create-employee";
	}
	
	
	@RequestMapping(value = "/delete/{employee_id}", method = RequestMethod.GET)
	public String deleteEmployee(Model model, @PathVariable(name="employee_id")int employee_id ) {
		logger.info("Welcome to Employee post");
		// Calling the save employee method
		int result = employee_service.deleteEmployee(employee_id);
		
		if(result > 0) {
			model.addAttribute("message", "successful");
		}else {
			model.addAttribute("message", "error");
		}
		return "redirect:/employee";
	}
	
	@RequestMapping(value = "/update/{employee_id}", method = RequestMethod.GET)
	public String updateEmployee(Model model,  @PathVariable(name="employee_id")int employee_id ) {
		logger.info("Welcome to Employee post");
		// Calling the save employee method
		Employee employee = employee_service.getEmployeeById(employee_id);
		
		if(employee != null) {
			model.addAttribute("employee_object", employee);
			model.addAttribute("employee_mothod","update");
			return "employee";
		}else {
			model.addAttribute("message", "error");
			return "redirect:/employee";
		}
		
	}
	
	@RequestMapping(value = "/update-employee", method = RequestMethod.POST)
	public String updateEmployee(Model model,  @ModelAttribute(name="employee_object")Employee employee ) {
		logger.info("Welcome to Employee post");
		// Calling the save employee method
		int employee_id = employee_service.updateEmployee(employee);
		
		if(employee_id > 0) {
			model.addAttribute("message", "success");
			return "redirect:/employee";
		}else {
			model.addAttribute("message", "error");
			return "redirect:/employee";
		}
		
	}
}
