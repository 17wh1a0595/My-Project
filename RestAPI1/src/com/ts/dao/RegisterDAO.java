package com.ts.dao;

import java.util.List;

import org.hibernate.SessionFactory;

import com.rest.dto.Passenger;
import com.ts.db.HibernateTemplate;

public class RegisterDAO {
	
	private SessionFactory factory = null;
	public int register(Passenger passen) {	
		return HibernateTemplate.addObject(passen);
	}
	
	
	public Passenger getpassenger(int passengerId) {
		return (Passenger)HibernateTemplate.getObject(Passenger.class,passengerId);
	}

	public List<Passenger> getAllPass() {
		List<Passenger> pass =(List)HibernateTemplate.getObjectListByQuery("from Passenger");
		return pass;	
	}
}