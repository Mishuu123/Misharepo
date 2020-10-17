package com.Product.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bill {

	@Id
	private Integer bill_Id;  // this is bill id 
	private Integer product_Id;
	private Integer customer_Id;   // customer id 
	private Double rate;
	private Double tax_rate;   // price 
	private Double price;
	private Integer quantity;   // quantity
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Integer getBill_Id() {
		return bill_Id;
	}
	public void setBill_Id(Integer bill_Id) {
		this.bill_Id = bill_Id;
	}
	public Integer getProduct_Id() {
		return product_Id;
	}
	public void setProduct_Id(Integer product_Id) {
		this.product_Id = product_Id;
	}
	public Integer getCustomer_Id() {
		return customer_Id;
	}
	public void setCustomer_Id(Integer customer_Id) {
		this.customer_Id = customer_Id;
	}
	public Double getRate() {
		return rate;
	}
	public void setRate(Double rate) {
		this.rate = rate;
	}
	public Double getTax_rate() {
		return tax_rate;
	}
	public void setTax_rate(Double tax_rate) {
		this.tax_rate = tax_rate;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	
}
