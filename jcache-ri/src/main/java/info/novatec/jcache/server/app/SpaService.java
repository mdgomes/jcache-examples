package info.novatec.jcache.server.app;

/**
 * Created by paoli on 30.06.17.
 */
public class SpaService {

    public int getChargesForUser(String id) {
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return 10;
    }
}
