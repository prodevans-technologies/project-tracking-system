package com.prodevans.project.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "task_table")
public class Task {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "task_id")
	private int task_id;

	@Column(name = "task_name")
	private String task_name;

	@Column(name = "task_assigndate")
	private Date task_assigndate;

	@Column(name = "task_person", length = 100)
	private String task_person;

	@Column(name = "emp_id")
	private int emp_id;

	@Column(name = "task_status")
	private String task_status;

	@Column(name = "task_type")
	private String task_type;

	@Column(name = "task_description")
	private String task_description;

	@Column(name = "project_id")
	private int project_id;

	/**
	 * Default constructrue for the task
	 */

	public Task() {
		super();
	}

	/**
	 * @param Task_id
	 * @param Task_name
	 * @param Task_assigndate
	 * @param Task_person
	 * @param Emp_id
	 * @param task_status
	 * @param task_type
	 * @param task_description
	 * @param project_id
	 */

	public Task(int task_id, String task_name, Date task_assigndate, String task_person, int emp_id, String task_status,
			String task_type, String task_description, int project_id) {
		super();
		this.task_id = task_id;
		this.task_name = task_name;
		this.task_assigndate = task_assigndate;
		this.task_person = task_person;
		this.emp_id = emp_id;
		this.task_status = task_status;
		this.task_type = task_type;
		this.task_description = task_description;
		this.project_id = project_id;
	}

	public int getTask_id() {
		return task_id;
	}

	public void setTask_id(int task_id) {
		this.task_id = task_id;
	}

	public String getTask_name() {
		return task_name;
	}

	public void setTask_name(String task_name) {
		this.task_name = task_name;
	}

	public Date getTask_assigndate() {
		return task_assigndate;
	}

	public void settask_assigndate(Date task_assigndate) {
		this.task_assigndate = task_assigndate;
	}

	public String getTask_person() {
		return task_person;
	}

	public void setTask_person(String task_person) {
		this.task_person = task_person;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getTask_status() {
		return task_status;
	}

	public void setTask_status(String task_status) {
		this.task_status = task_status;
	}

	public String getTask_type() {
		return task_type;
	}

	public void setTask_type(String task_type) {
		this.task_type = task_type;
	}

	public String getTask_description() {
		return task_description;
	}

	public void setTask_description(String task_description) {
		this.task_description = task_description;
	}

	public int getProject_id() {
		return project_id;
	}

	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}

	@Override
	public String toString() {
		return "Task [task_id=" + task_id + ", task_name=" + task_name + ", task_assigndate=" + task_assigndate
				+ ", task_person=" + task_person + ", emp_id=" + emp_id + ", task_status=" + task_status
				+ ", task_type=" + task_type + ", task_description=" + task_description + ", project_id=" + project_id
				+ "]";
	}
}
