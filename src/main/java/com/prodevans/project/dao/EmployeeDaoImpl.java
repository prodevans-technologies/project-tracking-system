package com.prodevans.project.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.prodevans.project.dto.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	private static final Logger logger = LoggerFactory.getLogger(EmployeeDaoImpl.class);

	@Autowired
	private SessionFactory sessionFactory;

	/**
	 * @param sessionFactory
	 *            the sessionFactory to set
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public Integer insertEmployee(Employee emp) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		int result = 0;
		try {
			if (emp != null) {
				result = (Integer) session.save(emp);
				tx.commit();
				session.close();
			}

		} catch (Exception e) {
			e.printStackTrace();
			logger.error("Error in saving the employee :"+ e.getMessage());
			tx.rollback();
			session.close();
		}
		return result;
	}

	@Override
	public Integer updateEmployee(Employee emp) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		int result = 0;
		try {
			if (emp != null) {
				session.update(emp);
				tx.commit();
				session.close();
				result = 1;
			}

		} catch (Exception e) {
			e.printStackTrace();
			logger.error("Error in updating the employee :"+ e.getMessage());
			tx.rollback();
			session.close();
		}
		return result;
	}

	@Override
	public Integer deleteEmployee(Integer employee_id) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		int result = 0;
		try {
			if (employee_id != 0) {
				Employee employee = session.get(Employee.class, employee_id);
				if (employee != null) {
					session.delete(employee);
					result = 1;
				}
				tx.commit();
				session.close();
			}

		} catch (Exception e) {
			e.printStackTrace();
			logger.error("Error in deletion the employee :" + e.getMessage());
			tx.rollback();
			session.close();
			result = 0;
		}
		return result;
	}

	@Override
	public List<Employee> getEmployees() {
		List<Employee> employees = null;
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		try {
			employees = session.createCriteria(Employee.class).list();
			tx.commit();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
			logger.error("Error in get all employees :"+ e.getMessage());
			tx.rollback();
			session.close();
		}

		return employees;
	}

	@Override
	public Employee getEmployeeById(Integer employee_id) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Employee emp = null;
		try {
			if (employee_id != 0) {
				emp = session.get(Employee.class, employee_id);
				tx.commit();
				session.close();
			}

		} catch (Exception e) {
			e.printStackTrace();
			logger.error("Error in getting the employee :"+ e.getMessage());
			tx.rollback();
			session.close();
		}
		return emp;
	}

}
