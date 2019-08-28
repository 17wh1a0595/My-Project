package com.rest.dto;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

//import com.ts.db.BusSearch;

public class BusClient {

	public static void main(String[] args) {
			Configuration cfg=new AnnotationConfiguration();

			cfg=cfg.configure("hibernate.cfg.xml");

			SessionFactory factory=cfg.buildSessionFactory();

			Session session=factory.openSession();
			
			Transaction tx = session.beginTransaction();
			
			Passenger passenger1 = new Passenger();

			passenger1.setPassName("Raju");
			passenger1.setGender("MALE");
			passenger1.setEmail("raju123@gmail.com");
			passenger1.setPassword("1234");
			
			Driver driver1 = new Driver();
			driver1.setDriverName("Driver1");
			
			Driver driver2 = new Driver();
			driver2.setDriverName("Driver2");
	
			Driver driver3 = new Driver();
			driver3.setDriverName("Driver3");
			
			Driver driver4 = new Driver();
			driver4.setDriverName("Driver4");
			
			Driver driver5 = new Driver();
			driver5.setDriverName("Driver5");
			
			Driver driver6 = new Driver();
			driver6.setDriverName("Driver6");
			
			
			Bus bus1 = new  Bus();
			bus1.setOwner("SACHIN");
			bus1.setNoOfSeats(50);
			bus1.setBusType("ac");
			
			Bus bus2 = new  Bus();
			
			bus2.setOwner("Mango Travels");
			bus2.setNoOfSeats(50);
			bus2.setBusType("sleeper");
		
		
			
			Bus bus3 = new  Bus();
			
			bus3.setOwner("Apple Travels");
			bus3.setNoOfSeats(50);
			bus3.setBusType("Sleeper");
			
			
			Bus bus4 = new  Bus();
			
			bus4.setOwner("Apple Travels");
			bus4.setNoOfSeats(50);
			bus4.setBusType("Sleeper");
			
			Bus bus5 = new  Bus();
			bus5.setOwner("Apple Travels");
			bus5.setNoOfSeats(50);
			bus5.setBusType("Sleeper");
			
			Bus bus6 = new  Bus();
			
			bus6.setOwner("Apple Travels");
			bus6.setNoOfSeats(50);
			bus6.setBusType("Sleeper");
			

			
			
			
			BusSearch busSearch1 = new BusSearch();
			busSearch1.setSource("Hyderabad");
			busSearch1.setDestination("Mumbai");
			busSearch1.setArrivalTime("12:00 PM");
			busSearch1.setDepartureTime("09:00 AM");
			busSearch1.setJourneyDate(new java.util.Date("2019/8/23"));
			busSearch1.setNoOfSeats(50);
			busSearch1.setPrice(1200);
		
			
			BusSearch busSearch2 = new BusSearch();
			
			busSearch2.setSource("Bengaluru");
			busSearch2.setDestination("Mumbai");
			busSearch2.setArrivalTime("11:30 PM");
			busSearch2.setDepartureTime("7:30 AM");
			busSearch2.setJourneyDate(new java.util.Date("2019/5/9"));
			busSearch2.setNoOfSeats(50);
			busSearch2.setPrice(2000);
			
		
			BusSearch busSearch3 = new BusSearch();
			busSearch3.setSource("Delhi");
			busSearch3.setDestination("Kerala");
			busSearch3.setArrivalTime("7:30 AM");
			busSearch3.setDepartureTime("09:00 PM");
			busSearch3.setJourneyDate(new java.util.Date("2019/7/12"));
			busSearch3.setNoOfSeats(50);
			busSearch3.setPrice(5000);
			
			BusSearch busSearch4 = new BusSearch();
			busSearch4.setSource("Delhi");
			busSearch4.setDestination("Kerala");
			busSearch4.setArrivalTime("9:30 AM");
			busSearch4.setDepartureTime("11:00 PM");
			busSearch4.setJourneyDate(new java.util.Date("2019/11/11"));
			busSearch4.setNoOfSeats(50);
			busSearch4.setPrice(4500);
			
			BusSearch busSearch5= new BusSearch();
			busSearch5.setSource("Hyderabad");
			busSearch5.setDestination("Mumbai");
			busSearch5.setArrivalTime("1:00 PM");
			busSearch5.setDepartureTime("11:00 AM");
			busSearch5.setJourneyDate(new java.util.Date("2019/12/21"));
			busSearch5.setNoOfSeats(50);
			busSearch5.setPrice(1300);
		
			BusSearch busSearch6 = new BusSearch();
			busSearch6.setSource("Hyderabad");
			busSearch6.setDestination("Mumbai");
			busSearch6.setArrivalTime("14:00 PM");
			busSearch6.setDepartureTime("11:45 AM");
			busSearch6.setJourneyDate(new java.util.Date("2019/12/21"));
			busSearch6.setNoOfSeats(50);
			busSearch6.setPrice(1100);
		
						
	/*Reservations reservations = new Reservations();
			reservations.setDateOfJourney(new java.util.Date());
			reservations.setDateOfJourney(new java.util.Date(12/5/2017));
			reservations.setSource("Hyd");
			reservations.setDestination("Mumbai");
			reservations.setPrice(999.99);
			reservations.setDriver(driver1);
			reservations.setPassenger(passenger1);
			reservations.setSeatNo("8");
		//	reservations.getBus().add(bus1);			
			
						
		passenger.getReservations().add(reservations);
			//passenger.setCancellation(cancellation);
			bus.getReservations().add(reservations);
			driver.getReservations().add(reservations);
			
			
			reservations.setPassenger(passenger);
			reservations.setBus(bus);
			reservations.setDriver(driver);
			*/
			
			/*Reservations reservation1 = new Reservations();
			reservation1.setBus(bus1);
			reservation1.setDriver(driver1);
			reservation1.setPassenger(passenger1);
			reservation1.setSeatNo("A1");
			reservation1.setSource("Hyderabad");
			reservation1.setDestination("Mumbai");
			*/
			busSearch1.setBus(bus1);
			bus1.setBusSearch(busSearch1);
			driver1.setBusSearch(busSearch1);
			
			busSearch2.setBus(bus2);
			bus2.setBusSearch(busSearch2);
			driver2.setBusSearch(busSearch2);

			busSearch3.setBus(bus3);
			bus3.setBusSearch(busSearch3);
			driver3.setBusSearch(busSearch3);
			
			busSearch4.setBus(bus4);
			bus4.setBusSearch(busSearch4);
			driver4.setBusSearch(busSearch4);
			
			busSearch5.setBus(bus5);
			bus5.setBusSearch(busSearch5);
			driver5.setBusSearch(busSearch5);
			
			busSearch6.setBus(bus6);
			bus6.setBusSearch(busSearch6);
			driver6.setBusSearch(busSearch6);
			
			busSearch1.setDriver(driver1);
			busSearch2.setDriver(driver2);
			busSearch3.setDriver(driver3);
			busSearch4.setDriver(driver4);
			busSearch5.setDriver(driver5);
			busSearch6.setDriver(driver6);
			
			
			Seat seat1 = new Seat();
			seat1.setBusId(1);
			//seat1.setSeatNo("a123");
			//seat1.setNoOfSeats("3");
			seat1.setStatus("false");
			
		
			Seat seat2 = new Seat();
			seat2.setBusId(1);
			//seat2.setSeatNo("A1");
			//seat2.setNoOfSeats("1");
			seat2.setStatus("false");
			
			Seat seat3 = new Seat();
			seat3.setBusId(1);
			//seat3.setSeatNo("A3");
			//seat3.setNoOfSeats("1");
			
			seat3.setStatus("false");
			
			Seat seat4 = new Seat();
			seat4.setBusId(1);
			//seat4.setSeatNo("A4");
			//seat4.setNoOfSeats("3");
			seat4.setStatus("false");
			
			Seat seat5 = new Seat();
			seat5.setBusId(1);
			//seat5.setSeatNo("A5");
			//seat5.setNoOfSeats("3");
			seat5.setStatus("false");
			
			Seat seat6 = new Seat();
			seat6.setBusId(1);
			//seat6.setSeatNo("A6");
			//seat6.setNoOfSeats("3");
			seat6.setStatus("false");
			
			Seat seat7 = new Seat();
			seat7.setBusId(1);
			//seat7.setSeatNo("A7");
			//seat7.setNoOfSeats("3");
			seat7.setStatus("false");
			
			Seat seat8 = new Seat();
			seat8.setBusId(1);
			//seat8.setSeatNo("A8");
			//seat8.setNoOfSeats("3");
			seat8.setStatus("false");
			
			Seat seat9 = new Seat();
			seat9.setBusId(1);
			//seat9.setSeatNo("A9");
			//seat9.setNoOfSeats("3");
			seat9.setStatus("false");
			
			Seat seat10 = new Seat();
			seat10.setBusId(1);
			//seat10.setSeatNo("A10");
		//	seat10.setNoOfSeats("3");
			seat10.setStatus("false");
			
			

			session.save(bus1);
			session.save(bus2);
			session.save(bus3);
			session.save(bus4);
			session.save(bus5);
			session.save(bus6);
			
			
			session.save(driver1);
			session.save(driver2);
			session.save(driver3);
			session.save(driver4);
			session.save(driver5);
			session.save(driver6);
			
			
			session.save(busSearch1);
			session.save(busSearch2);
			session.save(busSearch3);
			session.save(busSearch4);
			session.save(busSearch5);
			session.save(busSearch6);
			
			
			session.save(passenger1);
			
			
			session.save(seat1);
			session.save(seat2);
			session.save(seat3);
			session.save(seat4);
			session.save(seat5);
			session.save(seat6);
			session.save(seat7);
			session.save(seat8);
			session.save(seat9);
			session.save(seat10);
			//session.save(reservations);
			
			
			
			
			
			tx.commit();
		
			System.out.println("Objects saved successfully...");
			
			session.close();
		} 
}