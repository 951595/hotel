package com.example.demo.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hotel {
	@Id
	@GeneratedValue
	private int Id;
	private String name;
	private String city;
	private String state;
	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Hotel [Id=" + Id + ", name=" + name + ", city=" + city + ", state=" + state + "]";
	}
	
	

}
