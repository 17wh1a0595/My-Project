package com.ts.dao;


import java.util.List;

import org.hibernate.SessionFactory;

import com.rest.dto.Passenger;
import com.rest.dto.Reservations;
import com.ts.db.HibernateTemplate;

public class ReservationDAO {
	
	private SessionFactory factory = null;
	public int reservation(Reservations reservation) {	
		return HibernateTemplate.addObject(reservation);
	}
	
	/*
	public Passenger getpassenger(int passengerId) {
		return (Passenger)HibernateTemplate.getObject(Passenger.class,passengerId);
	}*/

	public List<Passenger> getAllPass() {
		List<Passenger> pass =(List)HibernateTemplate.getObjectListByQuery("from Passenger");
		return pass;	
	}


	/*public void reservation(Reservations reservation) {
		// TODO Auto-generated method stub
		
	}*/
}
