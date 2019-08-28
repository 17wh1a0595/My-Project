package com.rest.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Bus {
@Id@GeneratedValue
	private int busId;
	private String owner;
	private int noOfSeats;
	private String busType;
	
	
	@OneToMany(mappedBy="bus",cascade=CascadeType.ALL)
	@JsonManagedReference
	List<Reservations> reservations= new ArrayList<Reservations>();

	
	@OneToOne(mappedBy = "bus")
	@JsonManagedReference
	private BusSearch busSearch;
	

	
	
	
	

	public int getBusId() {
		return busId;
	}


	public void setBusId(int busId) {
		this.busId = busId;
	}


	public String getOwner() {
		return owner;
	}


	public void setOwner(String owner) {
		this.owner = owner;
	}


	public int getNoOfSeats() {
		return noOfSeats;
	}


	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}


	public String getBusType() {
		return busType;
	}


	public void setBusType(String busType) {
		this.busType = busType;
	}


	public List<Reservations> getReservations() {
		return reservations;
	}


	public void setReservations(List<Reservations> reservations) {
		this.reservations = reservations;
	}


	public BusSearch getBusSearch() {
		return busSearch;
	}


	public void setBusSearch(BusSearch busSearch) {
		this.busSearch = busSearch;
	}
	
}
