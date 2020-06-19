package com.Product.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	private Integer product_Id;
	private String product_name;
	private String company;
	private Double rate;
	private Double tax_rate;
	private Enum tax_status;

	public Integer getProduct_Id() {
		return product_Id;
	}

	public void setProduct_id(Integer product_id) {
		this.product_Id = product_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
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

	public Enum getTax_status() {
		return tax_status;
	}

	public void setTax_status(Enum tax_status) {
		this.tax_status = tax_status;
	}

}
