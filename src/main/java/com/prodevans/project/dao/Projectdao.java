package com.prodevans.project.dao;

import java.util.List;

import com.prodevans.project.dto.Project;


public interface Projectdao {
	Integer insertProject(Project pro);

	Integer updateProject(Project pro);

	Integer deleteProject(Integer project_id);

	List<Project> getProject();

	Project getProjectById(Integer project_id);
}
