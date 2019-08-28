package com.ts.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;

import com.rest.dto.Bus;
import com.rest.dto.BusSearch;
import com.ts.db.HibernateTemplate;

public class BusDAO {

	private SessionFactory factory = null;
	
	public List<Bus> getBus(String source,String destination) {

		return (List<Bus>)HibernateTemplate.getObjectByBus(source,destination);
	}

	public int register(Bus bus) {
		return HibernateTemplate.addObject(bus);
	}

	public List<Bus> getAllBuses() {
		//System.out.println(source + " " + destination);1
		List<Bus> buses=(List)HibernateTemplate.getObjectListByQuery("from Bus");
		System.out.println("Inside All Buses ..."+buses);
		return buses;	
	}
	public List<Bus> getAllBus(String source,String destination) {
		System.out.println(source + " " + destination );
		List<Bus> buses = HibernateTemplate.getBusListByQuery(source, destination);
		System.out.println("Inside All Buses ..." + buses);
		return buses;	
	}
	public Bus getBus(int id) {
		return (Bus)HibernateTemplate.getObject(Bus.class,id);
	}
	public int delete(int busId) {
		// TODO Auto-generated method stub
		return HibernateTemplate.deleteObject(Bus.class, busId);
	}

	public List<BusSearch> searchBuses(String source,String destination, java.sql.Date journeyDate) {
		
		List<BusSearch> buses=(List)HibernateTemplate.getObjectListByQuery("from BusSearch");
		  System.out.println("Recieved path params: "+source+" "+destination+journeyDate);
	      
		List<BusSearch> filteredBuses = new ArrayList<BusSearch>();
		for(BusSearch bs : buses) {
			  System.out.println(bs.getJourneyDate()); 
		      
			if(bs.getSource().equalsIgnoreCase(source) && bs.getDestination().equalsIgnoreCase(destination) && bs.getJourneyDate().compareTo(journeyDate)==0) {
				filteredBuses.add(bs);
			}
		}
		
		return filteredBuses;	
	}

	
}