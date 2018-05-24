package com.prodevans.project.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProfileController {
private static final Logger logger = LoggerFactory.getLogger( ProfileController.class);
	
	/**
	 * This method will map Get request to ProfileController
	 * @param model
	 * @return ProfileController
	 */
	@RequestMapping(value = "/profile-controller", method = RequestMethod.GET)
	public String getProfileController(Model model) {
		logger.info("Welcome to create Profile-Controller");
		return "profile-controller";
	}
	
}
