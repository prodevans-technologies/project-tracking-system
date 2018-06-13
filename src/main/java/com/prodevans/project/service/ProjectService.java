package com.prodevans.project.service;

import java.util.List;

import com.prodevans.project.dto.Project;

public interface ProjectService {
	Integer insertProject(Project pro);

	Integer updateProject(Project pro);

	Integer deleteProject(Integer project_id);

	List<Project> getProject();

	Project getProjectById(Integer Project_id);
}
