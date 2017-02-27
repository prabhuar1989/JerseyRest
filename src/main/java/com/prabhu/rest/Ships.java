package com.prabhu.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.prabhu.vehicles.Ship;

/**
 * Root resource (exposed at "ships" path)
 */
@Path("ships")
public class Ships {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Path("/getShips")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Ship> getShips() {
        
    	Ship titanic = new Ship();
    	titanic.setName("Titanic");
    	titanic.setType("Cruise");
    	titanic.setNationality("Great Britian");
    	
    	Ship insArihant = new Ship();
    	insArihant.setName("INS-Arihant");
    	insArihant.setType("Submarine");
    	insArihant.setNationality("India");
    	
    	Ship insVikramaditya = new Ship();
    	insVikramaditya.setName("INS-Vikramaditya");
    	insVikramaditya.setType("Carrier");
    	insVikramaditya.setNationality("India");
    	
    	List<Ship> ships = new ArrayList<Ship>();
    	ships.add(titanic);
    	ships.add(insArihant);
    	ships.add(insVikramaditya);
    	
    	return ships;
    
    }
}
