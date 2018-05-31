package com.prodevans.project.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmployeeController {
private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);
	
	/**
	 * This method will map Get request to Employee
	 * @param model
	 * @return Employee
	 */
	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public String getEmployees(Model model) {
		logger.info("Welcome to Employee-Controller");
		return "employee-list";
	}

	@RequestMapping(value = "/create-employee", method = RequestMethod.GET)
	public String createEmployee(Model model) {
		logger.info("Welcome to Employee-Controller");
		return "employee";
	}
}
