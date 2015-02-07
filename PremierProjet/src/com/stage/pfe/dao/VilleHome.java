package com.stage.pfe.dao;

// Generated 5 f�vr. 2015 16:12:35 by Hibernate Tools 3.4.0.CR1

import java.util.List;

import javax.naming.InitialContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Criteria;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.stage.pfe.persistance.Ville;
import com.stage.pfe.persistance.Ville;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Ville.
 * @see com.stage.pfe.dao.Ville
 * @author Hibernate Tools
 */
public class VilleHome {

	private static final Log log = LogFactory.getLog(VilleHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext()
					.lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException(
					"Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Ville transientInstance) {
		log.debug("persisting Ville instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Ville instance) {
		log.debug("attaching dirty Ville instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Ville instance) {
		log.debug("attaching clean Ville instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Ville persistentInstance) {
		log.debug("deleting Ville instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Ville merge(Ville detachedInstance) {
		log.debug("merging Ville instance");
		try {
			Ville result = (Ville) sessionFactory.getCurrentSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Ville findById(java.lang.Integer id) {
		log.debug("getting Ville instance with id: " + id);
		try {
			Ville instance = (Ville) sessionFactory.getCurrentSession().get(
					"com.stage.pfe.dao.Ville", id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<Ville> findByExample(Ville instance) {
		log.debug("finding Ville instance by example");
		try {
			List<Ville> results = (List<Ville>) sessionFactory
					.getCurrentSession()
					.createCriteria("com.stage.pfe.dao.Ville")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
	
	public List<Ville> findAll() {//select * from personne;
		Criteria crit = sessionFactory.getCurrentSession().createCriteria(
		Ville.class);
		return crit.list();
		}
}
