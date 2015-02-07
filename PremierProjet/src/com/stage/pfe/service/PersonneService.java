package com.stage.pfe.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.stage.pfe.dao.HibernateUtil;
import com.stage.pfe.dao.PersonneHome;
import com.stage.pfe.persistance.Personne;

public class PersonneService {
	PersonneHome dao = new PersonneHome() ;
	
	public PersonneService (){
		
	}
	public List<Personne> recherchePersonne(){
		List<Personne> liste = null; 
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		
		Transaction tx = null;
		try {
		tx = session.beginTransaction();
		liste = dao.findAll();
		tx.commit();
		} catch (RuntimeException ex) {
		if (tx != null)
		tx.rollback();
		ex.printStackTrace();
		}
		return (liste);
	
}
}
