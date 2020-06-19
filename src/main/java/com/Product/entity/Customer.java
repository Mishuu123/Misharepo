package com.Product.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {

	@Id
	private Integer customer_Id;
	private String customerName;
	private Integer bill_Id;
	private Integer address_id;
	public Integer getCid() {
		return customer_Id;
	}
	public void setCid(Integer customer_Id) {
		 this.customer_Id = customer_Id;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Integer getBill_Id() {
		return bill_Id;
	}
	public void setBill_id(Integer bill_Id) {
		this.bill_Id = bill_Id;
	}
	public Integer getAddress_id() {
		return address_id;
	}
	public void setAddress_id(Integer address_id) {
		this.address_id = address_id;
	}
	
}
