package de.nt.jcache.spring;

import org.springframework.stereotype.Service;

@Service
public class RoomService {

    public int getChargesForUser(String id) {
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return 10;
    }
}
