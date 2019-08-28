package com.ts.dao;

import java.util.List;

import org.hibernate.SessionFactory;

import com.rest.dto.Passenger;
import com.ts.db.HibernateTemplate;

public class LoginDAO {
	
	private SessionFactory factory = null;
	public int login(Passenger passen) {	
		return HibernateTemplate.addObject(passen);
	}
	
	
/*	public Passenger getpassenger(int passengerId) {
		return (Passenger)HibernateTemplate.getObject(Passenger.class,passengerId);
	}
*/
	public List<Passenger> getAllPass() {
		List<Passenger> pass =(List)HibernateTemplate.getObjectListByQuery("from Passenger");
		return pass;	
	}


	public Passenger login(String email, String password) {
		// TODO Auto-generated method stub
		return (Passenger)HibernateTemplate.getObjectByUserName(email,password);
	}
}