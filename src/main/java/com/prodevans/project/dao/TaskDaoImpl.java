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
import com.prodevans.project.dto.Task;

@Repository
public class TaskDaoImpl implements TaskDao {
	
	
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
	public Integer insertTask(Task tsk) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		int result = 0;
		try {
			if (tsk != null) {
				result = (Integer) session.save(tsk);
				tx.commit();
				session.close();
			}

		} catch (Exception e) {
			e.printStackTrace();
			logger.error("Error in saving the task :"+ e.getMessage());
			tx.rollback();
			session.close();
		}
		
		return result;
	}

	@Override
	public Integer updateTask(Task tsk) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		int result = 0;
		try {
			if (tsk != null) {
				session.update(tsk);
				tx.commit();
				session.close();
				result = 1;
			}

		} catch (Exception e) {
			e.printStackTrace();
			logger.error("Error in updating the task :"+ e.getMessage());
			tx.rollback();
			session.close();
		}
		return result;
	}

	@Override
	public Integer deleteTask(Integer task_id) {
		// TODO Auto-generated method stub
		
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		int result = 0;
		try {
			if (task_id != 0) {
				Task tsk = session.get(Task.class, task_id);
				if (tsk != null) {
					session.delete(tsk);
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
	public List<Task> getTasks() {
		// TODO Auto-generated method stub
		
		List<Task> tasks = null;
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		try {
			tasks = session.createCriteria(Task.class).list();
			tx.commit();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
			logger.error("Error in get all tasks :"+ e.getMessage());
			tx.rollback();
			session.close();
		}

		return tasks;

	}

	@Override
	public Task getTaskById(Integer task_id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Task tsk = null;
		try {
			if (task_id != 0) {
				tsk = session.get(Task.class, task_id);
				tx.commit();
				session.close();
			}

		} catch (Exception e) {
			e.printStackTrace();
			logger.error("Error in getting the task :"+ e.getMessage());
			tx.rollback();
			session.close();
		}
		
		return null;
	}
	

}
