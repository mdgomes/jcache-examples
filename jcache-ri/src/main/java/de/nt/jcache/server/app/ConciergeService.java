package de.nt.jcache.server.app;

public class ConciergeService {

    public int getChargesForUser(String id) {
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return 2;
    }
}
