package com.rest.dto;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity
public class BusSearch {
	@Id@GeneratedValue
	private int searchId;
	private String source;
	private String destination;  
	private int noOfSeats;
	private double price;
	@Temporal(TemporalType.DATE)
	private Date journeyDate;
	private String arrivalTime;
	private String departureTime;

	@OneToOne
	@JsonBackReference
	@JoinColumn(name="busId")
	private Bus bus;

	@OneToOne
	@JsonBackReference
	@JoinColumn(name="driverId")
	private Driver driver;

	public BusSearch() {
	}
	
	public BusSearch(int searchId, String source, String destination, int noOfSeats, double price, Date journeyDate,
			String arrivalTime, String departureTime, Bus bus) {
		super();
		this.searchId = searchId;
		this.source = source;
		this.destination = destination;
		this.noOfSeats = noOfSeats;
		this.price = price;
		this.journeyDate = journeyDate;
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
		this.bus = bus;
	}

	public int getSearchId() {
		return searchId;
	}

	public void setSearchId(int searchId) {
		this.searchId = searchId;
	}

	public Date getJourneyDate() {
		return journeyDate;
	}

	public void setJourneyDate(Date journeyDate) {
		this.journeyDate = journeyDate;
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

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}


	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public Bus getBus() {
		return bus;
	}

	public void setBus(Bus bus) {
		this.bus = bus;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	
	
}
/*@OneToOne(mappedBy = "cancellation")
private Reservations reservation;

@ManyToOne
private Bus bus;
 */
