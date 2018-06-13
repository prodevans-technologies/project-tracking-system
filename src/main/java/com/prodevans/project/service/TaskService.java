package com.prodevans.project.service;

import java.util.List;

import com.prodevans.project.dto.Task;

public interface TaskService {
	Integer insertTask(Task emp);
	Integer updateTask(Task emp);
	Integer deleteTask(Integer task_id);
	List<Task> getTask();
	Task getTaskById(Integer task_id);
}

