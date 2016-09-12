/*
 * Contains the resource for performing zipcode insertion
 * 
 * Author: ABS
 * Date: 9/12/2016 
 * 
 */
package org.umassd.zipcode.resource;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.umassd.zipcode.repository.ZipCodeRepository;

@Path("insert")
public class Insert {
	
	
	@Path("{zip: \\d+}")
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	public String insert(@PathParam("zip") Integer zip){
		return ZipCodeRepository.zipInsert(zip);
	}
}
