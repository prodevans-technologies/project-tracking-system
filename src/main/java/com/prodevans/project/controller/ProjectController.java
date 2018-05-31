package com.prodevans.project.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProjectController {
private static final Logger logger = LoggerFactory.getLogger(ProjectController.class);
	
	/**
	 * This method will map Get request to ProjectController
	 * @param model
	 * @return ProjectController
	 */
	@RequestMapping(value = "/create-project", method = RequestMethod.GET)
	public String getProjectController(Model model) {
		logger.info("Welcome to create  project ");
		return "create-project";
	}
	
}
