package de.nt.jcache;

public class FridgeService {

    public int getChargesForUser(String id) {
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return 1000;
    }
}
