package de.nt.jcache.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class GuestApplication {

    public static void main(String[] args) {
        SpringApplication.run(GuestApplication.class, args);
    }
}
