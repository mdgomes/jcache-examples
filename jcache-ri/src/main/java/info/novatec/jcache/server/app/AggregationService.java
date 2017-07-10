/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info.novatec.jcache.server.app;

import java.util.logging.Logger;
import javax.cache.annotation.CacheDefaults;
import javax.cache.annotation.CacheKey;
import javax.cache.annotation.CacheResult;
import javax.inject.Inject;

@CacheDefaults(cacheName="guestCharges")
public class AggregationService {

    private static final Logger LOGGER = Logger.getLogger(AggregationService.class.getName());

    @Inject
    private ConciergeService conciergeService;

    @Inject
    private EntertainmentService entertainmentService;

    @Inject
    private FridgeService fridgeService;

    @Inject
    private PoolService poolService;

    @Inject
    private RoomService roomService;

    @Inject
    private SpaService spaService;

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
