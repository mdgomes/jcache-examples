package info.novatec.jcache.spring;

import org.springframework.stereotype.Service;

@Service
public class EntertainmentService {

    public int getChargesForUser(String id) {
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return 100;
    }
}
