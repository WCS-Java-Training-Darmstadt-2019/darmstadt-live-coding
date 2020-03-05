package com.wcs.java.basics.vars;

import java.io.Serializable;

/**
 * A Bean has a no-arg constructor
 * is serializable
 * has getter and setter
 * @author dbe
 *
 */
public class Car implements Serializable{
	
	private String brandName;
	

	public Car() {}
	
	public Car(String brandName) {
		super();
		this.brandName = brandName;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brandName == null) ? 0 : brandName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (brandName == null) {
			if (other.brandName != null)
				return false;
		} else if (!brandName.equals(other.brandName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Car [brandName=" + brandName + "]";
	}
	
	
	

}
