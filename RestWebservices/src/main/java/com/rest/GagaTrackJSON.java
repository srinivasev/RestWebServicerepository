package com.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/gaga")
public class GagaTrackJSON {
	
	@GET
	@Path("/latest")
	@Produces(MediaType.APPLICATION_JSON)
	public Track getTrack(){
		Track track = new Track();
		track.setSinger("Lady gaga");
		track.setTitle("illusion");
		return track;
	}
}
