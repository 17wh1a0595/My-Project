package com.rest.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Reservations {
	@Id@GeneratedValue
	private int ticketNo;
	private String source;
	private String destination;
	private double price;
	private Date dateOfJourney;
	private String seatNo;

	@ManyToOne
	@JsonBackReference
	@JoinColumn(name="busId")
	private Bus bus;
	
	@ManyToOne
	@JsonBackReference
	@JoinColumn(name="passId")
	private Passenger passenger; 
	
	@ManyToOne
	@JsonBackReference
	@JoinColumn(name="driverId")
	private Driver driver;
	
	


	@OneToMany(mappedBy="reservation",cascade=CascadeType.ALL)
	@JsonManagedReference
	List<Seat> seat= new ArrayList<Seat>();




	public Reservations(int ticketNo, String source, String destination, double price, Date dateOfJourney,
			String seatNo, Bus bus, Passenger passenger, Driver driver, List<Seat> seat) {
		super();
		this.ticketNo = ticketNo;
		this.source = source;
		this.destination = destination;
		this.price = price;
		this.dateOfJourney = dateOfJourney;
		this.seatNo = seatNo;
		this.bus = bus;
		this.passenger = passenger;
		this.driver = driver;
		this.seat = seat;
	}




	public int getTicketNo() {
		return ticketNo;
	}




	public void setTicketNo(int ticketNo) {
		this.ticketNo = ticketNo;
	}




	public String getSource() {
		return source;
	}




	public void setSource(String source) {
		this.source = source;
	}




	public String getDestination() {
		return destination;
	}




	public void setDestination(String destination) {
		this.destination = destination;
	}




	public double getPrice() {
		return price;
	}




	public void setPrice(double price) {
		this.price = price;
	}




	public Date getDateOfJourney() {
		return dateOfJourney;
	}




	public void setDateOfJourney(Date dateOfJourney) {
		this.dateOfJourney = dateOfJourney;
	}




	public String getSeatNo() {
		return seatNo;
	}




	public void setSeatNo(String seatNo) {
		this.seatNo = seatNo;
	}




	public Bus getBus() {
		return bus;
	}




	public void setBus(Bus bus) {
		this.bus = bus;
	}




	public Passenger getPassenger() {
		return passenger;
	}




	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}




	public Driver getDriver() {
		return driver;
	}




	public void setDriver(Driver driver) {
		this.driver = driver;
	}




	public List<Seat> getSeat() {
		return seat;
	}




	public void setSeat(List<Seat> seat) {
		this.seat = seat;
	}

	
	
	
	
	
	
	
	
	
	
}