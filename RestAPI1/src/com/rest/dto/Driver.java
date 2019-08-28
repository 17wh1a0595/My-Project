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
public class Driver {
	@Id@GeneratedValue
	private int driverId;	
	private String driverName;

	@OneToMany(mappedBy="driver", cascade=CascadeType.ALL)
	@JsonManagedReference
	List<Reservations> reservations= new ArrayList<Reservations>();

	
	@OneToOne(mappedBy = "driver")
	@JsonManagedReference
	private BusSearch busSearch;

/*	@OneToMany(mappedBy = "driver")
	@JsonManagedReference
	private Reservations reservation;
	*/
	
	public int getDriverId() {
		return driverId;
	}
	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
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


