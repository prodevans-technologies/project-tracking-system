package com.prodevans.project.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "project_table")
public class Project {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pro_id")
	private int pro_id;

	@Column(name = "pro_name")
	private String pro_name;

	@Column(name = "pro_description")
	private String pro_description;

	@Column(name = "pro_type")
	private String pro_type;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinTable(name="project_task_table",joinColumns=@JoinColumn(name="pro_id"),inverseJoinColumns=@JoinColumn(name="task_id"))
	private List<Task> task_list = new ArrayList<>();

	/**
	 * Default constructor for the projects
	 */
	public Project() {
		super();
	}

	

	/**
	 * @param pro_id
	 * @param pro_name
	 * @param pro_description
	 * @param pro_type
	 * @param task_list
	 */
	public Project(int pro_id, String pro_name, String pro_description, String pro_type, List<Task> task_list) {
		super();
		this.pro_id = pro_id;
		this.pro_name = pro_name;
		this.pro_description = pro_description;
		this.pro_type = pro_type;
		this.task_list = task_list;
	}



	public int getPro_id() {
		return pro_id;
	}

	public void setPro_id(int Pro_id) {
		this.pro_id = Pro_id;
	}

	public String getPro_name() {
		return pro_name;
	}

	public void setPro_name(String pro_name) {
		this.pro_name = pro_name;
	}

	public String getPro_description() {
		return pro_description;
	}

	public void setPro_description(String pro_description) {
		this.pro_description = pro_description;
	}

	public String getPro_type() {
		return pro_type;
	}

	public void setPro_type(String pro_type) {
		this.pro_type = pro_type;
	}

	public List<Task> getTask_list() {
		return task_list;
	}

	public void setTask_list(List<Task> task_list) {
		this.task_list = task_list;
	}

	@Override
	public String toString() {
		return "Project [pro_id=" + pro_id + ", pro_name=" + pro_name + ", pro_description=" + pro_description
				+ ", pro_type=" + pro_type + ", task_list=" + task_list + "]";
	}

	
}