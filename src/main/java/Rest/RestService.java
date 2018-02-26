package Rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import test1.Junit;

@Path("/")
public class RestService {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("vermenigvuldigen/{number1}/{number2}")
	public Response getvermedigvuldigen(@PathParam("number1") int number1,@PathParam("number2") int number2){
		Junit unit = new Junit();
		int result = unit.vermenigvuldigen(number1,number2);
		return Response.ok(result).build();
		
	}
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("concateneren/{number1}/{number2}")
	public Response getplakken(@PathParam("number1") String number1,@PathParam("number2") String number2){
		Junit unit = new Junit();
		String result = unit.concateneren(number1,number2);
		return Response.ok(result).build();
		
	}
}

