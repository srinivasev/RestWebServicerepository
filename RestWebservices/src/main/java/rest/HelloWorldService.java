package rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/storeId")
public class HelloWorldService {

	@GET
	@Path("/{param}")
	public Response getTitles(@PathParam("param") String storeId) {
		String output = "Store Name : Allen solly ";

		return Response.status(200).entity(output).build();
	}
}
