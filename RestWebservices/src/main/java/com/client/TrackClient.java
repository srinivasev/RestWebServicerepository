package com.client;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class TrackClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Client client = new Client();
		WebResource webResource = client
				.resource("http://localhost:8088/RestWebservices/rest/gaga/latest");
		WebResource webResource2 = client
				.resource("http://localhost:8088/RestWebservices/rest/storeId/123");
		System.out.println(webResource2.accept(MediaType.TEXT_PLAIN).get(ClientResponse.class).getEntity(String.class));
		
		ClientResponse clientResponse = webResource.accept("application/json")
				.get(ClientResponse.class);
		if (clientResponse.getStatus() != 200) {
			throw new RuntimeException("Failed : HTTP error code : "
					+ clientResponse.getStatus());
		}

		String output = clientResponse.getEntity(String.class);
		System.out.println("Output from Server .... \n");
		System.out.println(output);

	}

}
