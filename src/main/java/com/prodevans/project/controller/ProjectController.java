package com.prodevans.project.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.prodevans.project.dto.Project;

@Controller
@RequestMapping(value="/project")
public class ProjectController {

	private static final Logger logger = LoggerFactory.getLogger(ProjectController.class);
	
	
	/**
	 * This method will map Get request to ProjectController
	 * @param model
	 * @return ProjectController
	 */
	@RequestMapping(value = {"/create-project","/"}, method = RequestMethod.GET)
	public String getProjects(Model model) {
		logger.info("Welcome to create  project ");
		//Passing the project object
		model.addAttribute("project_object", new Project());
		return "create-project";
	}
	
	@RequestMapping(value = {"/create-project"}, method = RequestMethod.POST)
	public String insertProjects(Model model, @ModelAttribute(name="project_object")Project project) {

		
		return "create-project";
	}
	@RequestMapping(value = "/project-dashboard", method = RequestMethod.GET)
	public String getProjectDashboard(Model model) {
		logger.info("Welcome to create  project ");
		return "project-dashboard";
	}
	
}
