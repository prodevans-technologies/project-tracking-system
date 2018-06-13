package com.prodevans.project.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prodevans.project.dao.TaskDao;
import com.prodevans.project.dto.Task;

@Service
public class TaskServiceImpl implements TaskService {

	private static final Logger logger = LoggerFactory.getLogger(TaskServiceImpl.class);

	@Autowired
	private TaskDao task_dao;
	
	public void setTask_dao(TaskDao task_dao) {
		this.task_dao = task_dao;
	}

	@Override
	public Integer insertTask(Task tsk) {
		return this.task_dao.insertTask(tsk);
	}

	@Override
	public Integer updateTask(Task pro) {
		return this.task_dao.updateTask(pro);
	}

	@Override
	public Integer deleteTask(Integer task_id) {
		return this.task_dao.deleteTask(task_id);
	}

	@Override
	public List<Task> getTask() {
		return this.task_dao.getTask();
	}

	@Override
	public Task getTaskById(Integer task_id) {
		return this.task_dao.getTaskById(task_id);
	}

}
