/*
 * Contains the resource for performing zipcode deletion
 * 
 * Author: ABS
 * Date: 9/12/2016 
 * 
 */
package org.umassd.zipcode.resource;

import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.umassd.zipcode.repository.ZipCodeRepository;

@Path("delete")
public class Delete {
	
	
	@Path("{zip: \\d+}")
	@DELETE
	@Produces(MediaType.TEXT_PLAIN)
	public String insert(@PathParam("zip") Integer zip){
		return ZipCodeRepository.zipDelete(zip);
	}
}