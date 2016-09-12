/*
 * Contains the resource for checking the presence of zipcode
 * 
 * Author: ABS
 * Date: 9/12/2016 
 * 
 */
package org.umassd.zipcode.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.umassd.zipcode.repository.ZipCodeRepository;

@Path("has")
public class Has {

	@Path("{zip: \\d+}")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public boolean insert(@PathParam("zip") Integer zip){
		return ZipCodeRepository.isZipPresent(zip);
	}
	
}
