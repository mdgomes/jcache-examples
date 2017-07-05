/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.nt.jcache;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("guests")
public class GuestResource {
    
    @Inject
    private AggregationService aggregationService;
    
    @GET
    @Path("{id}/balance")
    public Response getBalance(@PathParam("id") String id) {
        
        String charges = aggregationService.getCharges(id);
        
        return Response.status(200).entity(charges).build();
    }
    
}