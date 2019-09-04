package com.bookticket.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "passenger_info")
public class PassengerInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column
	private String fname;
	
	@Column
	private String lname;
	
	@Column
	private String ticketno;
	
	@Column
	private String trainName;
	
	public PassengerInfo() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getTicketno() {
		return ticketno;
	}

	public void setTicketno(String ticketno) {
		this.ticketno = ticketno;
	}

	public String getTrainName() {
		return trainName;
	}

	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}

	@Override
	public String toString() {
		return "PassengerInfo [id=" + id + ", fname=" + fname + ", lname=" + lname + ", ticketno=" + ticketno
				+ ", trainName=" + trainName + "]";
	}
	
	
}
