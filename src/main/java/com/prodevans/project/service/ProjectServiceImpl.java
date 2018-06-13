package com.prodevans.project.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prodevans.project.dao.Projectdao;
import com.prodevans.project.dto.Project;

@Service
public class ProjectServiceImpl implements ProjectService {

	private static final Logger logger = LoggerFactory.getLogger(ProjectServiceImpl.class);

	@Autowired
	private Projectdao project_dao;
	
	public void setEmployee_dao(Projectdao project_dao) {
		this.project_dao = project_dao;
	}

	@Override
	public Integer insertProject(Project pro) {
		return this.project_dao.insertProject(pro);
	}

	@Override
	public Integer updateProject(Project pro) {
		return this.project_dao.updateProject(pro);
	}

	@Override
	public Integer deleteProject(Integer project_id) {
		return this.project_dao.deleteProject(project_id);
	}

	@Override
	public List<Project> getProject() {
		return this.project_dao.getProject();
	}

	@Override
	public Project getProjectById(Integer project_id) {
		return this.project_dao.getProjectById(project_id);
	}

}
