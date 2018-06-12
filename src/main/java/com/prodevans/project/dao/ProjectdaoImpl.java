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
import com.prodevans.project.dto.Project;

@Repository
public class ProjectdaoImpl implements Projectdao {

	private static final Logger logger = LoggerFactory.getLogger(ProjectdaoImpl.class);

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
	public Integer insertProject(Project pro) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		int result = 0;
		try {
			if (pro != null) {
				result = (Integer) session.save(pro);
				tx.commit();
				session.close();
			}

		} catch (Exception e) {
			e.printStackTrace();
			logger.error("Error in saving the project :"+ e.getMessage());
			tx.rollback();
			session.close();
		}
		return result;
	}

	@Override
	public Integer updateProject(Project pro) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		int result = 0;
		try {
			if (pro != null) {
				session.update(pro);
				tx.commit();
				session.close();
				result = 1;
			}

		} catch (Exception e) {
			e.printStackTrace();
			logger.error("Error in updating the project :"+ e.getMessage());
			tx.rollback();
			session.close();
		}
		return result;
	}

	@Override
	public Integer deleteProject(Integer employee_id) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		int result = 0;
		try {
			if (project_id != 0) {
				Project project = session.get(Project.class, project_id);
				if (project != null) {
					session.delete(project);
					result = 1;
				}
				tx.commit();
				session.close();
			}

		} catch (Exception e) {
			e.printStackTrace();
			logger.error("Error in deletion the project :" + e.getMessage());
			tx.rollback();
			session.close();
			result = 0;
		}
		return result;
	}

	@Override
	public List<Project> getProject() {
		List<Project> project = null;
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		try {
			Projects = session.createCriteria(Project.class).list();
			tx.commit();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
			logger.error("Error in get all projects :"+ e.getMessage());
			tx.rollback();
			session.close();
		}

		return projects;
	}

	@Override
	public Project getProjectById(Integer project_id) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Project emp = null;
		try {
			if (project_id != 0) {
				pro = session.get(Project.class,project_id);
				tx.commit();
				session.close();
			}

		} catch (Exception e) {
			e.printStackTrace();
			logger.error("Error in getting the project:"+ e.getMessage());
			tx.rollback();
			session.close();
		}
		return pro;
	}

}


