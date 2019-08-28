package com.ts.db;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.rest.dto.Bus;
import com.rest.dto.Passenger;

public class HibernateTemplate {

	private static SessionFactory sessionFactory;
	
	static
	{
		sessionFactory=new Configuration().configure().buildSessionFactory();
	}
	
	public static int addObject(Object obj)
	{
		System.out.println("Inside Template...");
		int result=0;
		
		Transaction tx=null;
		
		try {
			
			Session session=sessionFactory.openSession();
			tx=session.beginTransaction();
			
			session.save(obj);
			
			tx.commit();
			
			result=1;
			
		} catch (Exception e) {
		
			tx.rollback();
			
			e.printStackTrace();
		}
		
		return result;
	}
	
	public static Object getObject(Class c,Serializable serializable)
	{
		Object obj=null;
		
		try {			
			return sessionFactory.openSession().get(c,serializable);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return obj;
	}
	
	public static Object getObjectByUserName(String userName, String password) {
	
	String queryString = "from Passenger where email = :userName and  password = :password";
	  Query query = sessionFactory.openSession().createQuery(queryString);
	  query.setString("userName", userName);
	  query.setString("password", password);
	  Object queryResult = query.uniqueResult();
	  Passenger passenger = (Passenger)queryResult;
	  return passenger; 
	}
	
	
	public static Object getObjectByBus(String source, String destination) {
        String queryString = "from Bus where source  = :source and destination = :destination";
		Query query = sessionFactory.openSession().createQuery(queryString);
		query.setString("source", source);
		query.setString("destination", destination);
		Object queryResult = query.uniqueResult();
		Bus bus = (Bus)queryResult;
		return bus;
	
	}
	
	
	public static List<Bus> getBusListByQuery(String source, String destination) {
		String queryString = "from Bus";
		Query query = sessionFactory.openSession().createQuery(queryString);
		query.setString("source", source);
		query.setString("destination", destination);
		Object queryResult = query.uniqueResult();
		List<Bus> bus = (List<Bus>)queryResult;
		return bus;
	
	}
	
	
	public static List<Object> getObjectListByQuery(String query)
	{
		return sessionFactory.openSession().createQuery(query).list();
	}
	
	public static int updateObject(Object obj)
	{
		int result=0;
		
		Transaction tx=null;
		
		try {
			
			Session session=sessionFactory.openSession();
			tx=session.beginTransaction();
			
			session.saveOrUpdate(obj);
			
			tx.commit();
			
			result=1;
			
		} catch (Exception e) {
		
			tx.rollback();
			
			e.printStackTrace();
		}
		
		return result;
	}
	
	public static int deleteObject(Class c,Serializable serializable)
	{
		int result=0;
		
		Session session=sessionFactory.openSession();
		
		Transaction tx=session.beginTransaction();
		
		try {
			
			Object obj=session.get(c,serializable);
			
			session.delete(obj);
			
			tx.commit();
			
			result=1;
						
		} catch (Exception e) {
			
			e.printStackTrace();
			
			tx.rollback();
		}
		
		return result;
	}
}

