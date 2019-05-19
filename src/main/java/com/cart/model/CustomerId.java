package com.cart.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CustomerId implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "customer_id")
	private int customerId;

	@Column(name = "brandcode")
	private String brandCode;

	public CustomerId() {
	};

	public CustomerId(int customerId, String brandCode) {
		this.customerId = customerId;
		this.brandCode = brandCode;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getCustomerId() {
		return this.customerId;
	}

	public void setBrandcode(String brandcode) {
		this.brandCode = brandcode;
	}

	public String getBrandCode() {
		return this.brandCode;
	}
}
