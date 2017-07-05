/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.nt.jcache.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.cache.annotation.CacheDefaults;
import javax.cache.annotation.CacheKey;
import javax.cache.annotation.CacheResult;
import java.util.logging.Logger;

@CacheDefaults(cacheName="guestCharges")
@Service
public class AggregationService {

    private static final Logger LOGGER = Logger.getLogger(AggregationService.class.getName());

    private ConciergeService conciergeService;

    private EntertainmentService entertainmentService;

    private FridgeService fridgeService;

    private PoolService poolService;

    private RoomService roomService;

    private SpaService spaService;

    @Autowired
    public AggregationService (ConciergeService conciergeService, EntertainmentService entertainmentService,
                               FridgeService fridgeService, PoolService poolService, RoomService roomService,
                               SpaService spaService) {
        this.conciergeService = conciergeService;
        this.entertainmentService = entertainmentService;
        this.fridgeService = fridgeService;
        this.poolService = poolService;
        this.roomService = roomService;
        this.spaService = spaService;
    }

    @CacheResult
    public String getCharges(@CacheKey String id){
        LOGGER.info("Guest balance not found in cache.");

        int balance = conciergeService.getChargesForUser(id)
                + entertainmentService.getChargesForUser(id)
                + fridgeService.getChargesForUser(id)
                + poolService.getChargesForUser(id)
                + spaService.getChargesForUser(id)
                + roomService.getChargesForUser(id);

        return "Balance for guest " + id  + " is $" + balance;
    }


}
