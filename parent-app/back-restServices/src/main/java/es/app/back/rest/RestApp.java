package es.app.back.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Hello world!
 *
 */
@Path("/employee")
@Consumes(MediaType.APPLICATION_XML)
@Produces(MediaType.APPLICATION_XML)
public class RestApp {
	@GET
	@Path("/get/{id}")
	public void getEmployee(@PathParam("id") int id) {
		System.out.println("eeeee " + id);
	}

}
