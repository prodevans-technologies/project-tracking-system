package com.prodevans.project.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import javax.persistence.JoinColumn;


import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "employee_table")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="emp_id")
	private int emp_id;
	
	@Column(name="emp_email")
	private String emp_email;
	
	@Column(name="password")
	private String password;
	
	@Column(name="emp_name", length=100)
	private String emp_name;
	
	@Column(name="emp_designation")
	private String emp_designation;
	
	@Column(name="emp_phno")
	private String emp_phno;
	
	@Column(name="emp_address")
	private String emp_address;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Column(name="join_date")
	private Date join_date;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinTable(name="employee_task_table",joinColumns=@JoinColumn(name="emp_id"),inverseJoinColumns=@JoinColumn(name="task_id"))
	private List<Task> task_list = new ArrayList<>();
	
	/**
	 * Default constructrue for the employees 
	 */
	public Employee() {
		super();
	}

	

	/**
	 * @param emp_id
	 * @param emp_email
	 * @param password
	 * @param emp_name
	 * @param emp_designation
	 * @param emp_phno
	 * @param emp_address
	 * @param join_date
	 * @param task_list
	 */
	public Employee(int emp_id, String emp_email, String password, String emp_name, String emp_designation,
			String emp_phno, String emp_address, Date join_date, List<Task> task_list) {
		super();
		this.emp_id = emp_id;
		this.emp_email = emp_email;
		this.password = password;
		this.emp_name = emp_name;
		this.emp_designation = emp_designation;
		this.emp_phno = emp_phno;
		this.emp_address = emp_address;
		this.join_date = join_date;
		this.task_list = task_list;
	}



	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_email() {
		return emp_email;
	}

	public void setEmp_email(String emp_email) {
		this.emp_email = emp_email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getEmp_designation() {
		return emp_designation;
	}

	public void setEmp_designation(String emp_designation) {
		this.emp_designation = emp_designation;
	}

	public String getEmp_phno() {
		return emp_phno;
	}

	public void setEmp_phno(String emp_phno) {
		this.emp_phno = emp_phno;
	}

	public String getEmp_address() {
		return emp_address;
	}

	public void setEmp_address(String emp_address) {
		this.emp_address = emp_address;
	}

	public Date getJoin_date() {
		return join_date;
	}

	public void setJoin_date(Date join_date) {
		this.join_date = join_date;
	}

	public List<Task> getTask_list() {
		return task_list;
	}

	public void setTask_list(List<Task> task_list) {
		this.task_list = task_list;
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_email=" + emp_email + ", password=" + password + ", emp_name="
				+ emp_name + ", emp_designation=" + emp_designation + ", emp_phno=" + emp_phno + ", emp_address="
				+ emp_address + ", join_date=" + join_date + ", task_list=" + task_list + "]";
	}

	
	
}
