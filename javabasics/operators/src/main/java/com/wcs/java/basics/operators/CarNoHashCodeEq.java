package com.wcs.java.basics.operators;

import java.io.Serializable;

/**
 * A Bean has a no-arg constructor
 * is serializable
 * has getter and setter
 * @author dbe
 *
 */
public class CarNoHashCodeEq implements Serializable {
	
	private String brandName;

	public CarNoHashCodeEq() {}
	
	public CarNoHashCodeEq(String brandName) {
		super();
		this.brandName = brandName;
	}


	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

}
