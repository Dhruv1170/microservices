package com.api.vehiclemicroservices.Entity;

import java.util.Arrays;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vehicle {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String name;
	private String films;
	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", name=" + name + ", films=" + films + ", description=" + description
				+ ", vehicleClass=" + vehicleClass + "]";
	}
	public String getFilms() {
		return films;
	}
	public void setFilms(String films) {
		this.films = films;
	}
	public Long getId() {
		return id;
	}
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Vehicle(Long id, String name, String description, String vehicleClass) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.vehicleClass = vehicleClass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getVehicleClass() {
		return vehicleClass;
	}
	public void setVehicleClass(String vehicleClass) {
		this.vehicleClass = vehicleClass;
	}
	private String description;
	private String vehicleClass;

}
