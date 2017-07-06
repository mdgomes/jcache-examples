/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.nt.jcache.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("guests")
public class GuestRestController {
    
    private AggregationService aggregationService;

    @Autowired
    public GuestRestController(AggregationService aggregationService) {
        this.aggregationService = aggregationService;
    }
    
    @RequestMapping(path = "{id}/balance", method = RequestMethod.GET)
    public ResponseEntity getBalance(@PathVariable("id") String id) {
        
        String charges = aggregationService.getCharges(id);
        
        return ResponseEntity.ok().body(charges);
    }

}