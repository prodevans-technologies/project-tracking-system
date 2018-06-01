package com.prodevans.project.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TaskController {

	private static final Logger logger = LoggerFactory.getLogger(TaskController.class);

	/**
	 * This method will map Get request to TaskController
	 * 
	 * @param model
	 * @return TaskController
	 */
	@RequestMapping(value = "/task", method = RequestMethod.GET)
	public String getTaskController(Model model) {
		logger.info("Welcome to Task controller");
		return "task";
	}

}