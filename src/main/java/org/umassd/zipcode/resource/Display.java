/*
 * Contains the resource for displaying zipcode
 * 
 * Author: ABS
 * Date: 9/12/2016 
 * 
 */
package org.umassd.zipcode.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.umassd.zipcode.repository.ZipCodeRepository;

@Path("display")
public class Display {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String display(){
		return ZipCodeRepository.zipDisplay();
	}
}
