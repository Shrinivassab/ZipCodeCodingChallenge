/*
 * Contains the POJO class for the REST web service
 * 
 * Author: ABS
 * Date: 9/12/2016
 */

package org.umassd.zipcode.model;

public class ZipCode {
	
	private Integer zipValue;

	public Integer getZipValue() {
		return zipValue;
	}

	public void setZipValue(Integer zipValue) {
		this.zipValue = zipValue;
	}

	@Override
	public String toString() {
		return "ZipCode [zipValue=" + zipValue + "]";
	}
	
}
