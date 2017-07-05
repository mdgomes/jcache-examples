package de.nt.jcache;

public class PoolService {

    public int getChargesForUser(String id) {
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return 1;
    }
}
