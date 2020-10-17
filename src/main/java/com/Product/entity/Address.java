package com.Product.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {

	@Id
	private Integer address_Id;  //address id 
	private String addressLOne;	//address one line 
	private String addressLTwo;
	private String city;
	private String state;
	private Integer zipCode;
	private String country;
	public Integer getAId() {
		return address_Id;
	}
	public void setId(Integer address_Id) {
		this.address_Id = address_Id;
	}
	public String getAddressLOne() {
		return addressLOne;
	}
	public void setAddressLOne(String addressLOne) {
		this.addressLOne = addressLOne;
	}
	public String getAddressLTwo() {
		return addressLTwo;
	}
	public void setAddressLTwo(String addressLTwo) {
		this.addressLTwo = addressLTwo;
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
	public Integer getZipCode() {
		return zipCode;
	}
	public void setZipCode(Integer zipCode) {
		this.zipCode = zipCode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
}
