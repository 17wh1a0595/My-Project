package com.rest.RestAPI;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.rest.dto.Bus;
import com.rest.dto.BusSearch;
//import com.rest.dto.Department;
import com.rest.dto.Passenger;
import com.rest.dto.Reservations;
import com.ts.dao.BusDAO;
import com.ts.dao.LoginDAO;
import com.ts.dao.RegisterDAO;
import com.ts.dao.ReservationDAO;

@Path("myresource")
public class MyResource {
    @Path("hi")
	@GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hi() {
        return "Hi Service!";
    }
    
    @Path("hello")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello Service!";
    }
    
    
    
    @Path("register")
    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public void register(@FormParam("name") String name,@FormParam("email") String email,@FormParam("phone") String phone,@FormParam("gender") String gender) {
    	System.out.println(name+" "+email+" "+phone+" "+gender);
    	
    }
    
    @Path("registerJ")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void registerJ(Passenger passenger) {
    	System.out.println("Inside REST...");
    	RegisterDAO registerDAO = new RegisterDAO();
    	registerDAO.register(passenger); //send to database code 
    	//System.out.println(passenger.getDepartment().getDeptId()+" "+employee.getEmpId()+" "+employee.getEmpName()+" "+employee.getSalary());
    }
    
    
    
    @Path("login/{email}/{password}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Passenger login(@PathParam("email") String email,@PathParam("password") String password) {
        System.out.println("Recieved path params: "+email+" "+password); 
    	LoginDAO loginDAO = new LoginDAO();
        Passenger passenger = loginDAO.login(email, password);
        return passenger;
    } 
    
    
    @Path("reservation")
    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public void reservation(@FormParam("source") String source,@FormParam("destination") String destination ,@FormParam("dateOfJourney") String dateOfJourney,@FormParam("seatNo") String seatNo) {
    	System.out.println(source+" "+destination+" "+dateOfJourney+" "+seatNo);
    	
    }
    
    @Path("reservationJ")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void reservationJ(Reservations reservation) {
    	System.out.println("Inside REST...");
    	ReservationDAO reservationDAO = new ReservationDAO();
    	reservationDAO.reservation(reservation); //send to database code 
    	//System.out.println(passenger.getDepartment().getDeptId()+" "+employee.getEmpId()+" "+employee.getEmpName()+" "+employee.getSalary());
    }
    @Path("busSearch/{source}/{destination}/{journeyDate}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<BusSearch> busSearch(@PathParam("source") String source,@PathParam("destination") String destination,@PathParam("journeyDate") java.sql.Date journeyDate) {
        System.out.println("Recieved path params: "+source+" "+destination+journeyDate); 
        BusDAO busDAO = new BusDAO();
        List<BusSearch> filteredBuses= busDAO.searchBuses(source, destination,journeyDate); 
        return filteredBuses;
    }     
   
}