package com.prodevans.project.dao;

import java.util.List;

import com.prodevans.project.dto.Task;

public interface TaskDao {
	Integer insertTask(Task tsk);

	Integer updateTask(Task tsk);

	Integer deleteTask(Integer task_id);

	List<Task> getTasks();

	Task getTaskById(Integer task_id);
}
