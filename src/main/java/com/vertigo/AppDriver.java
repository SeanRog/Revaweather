package com.vertigo;

import com.vertigo.entities.AppUser;
import com.vertigo.entities.AppUserRole;
import com.vertigo.entities.Location;
import com.vertigo.repositories.AppUserRepository;
import com.vertigo.services.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.HashSet;
import java.util.Set;

@EnableWebMvc
@EnableTransactionManagement
@SpringBootApplication
public class AppDriver {

    public static void main(String[] args) {
//        AppUserRole appUserRole = new AppUserRole(1, "ADMIN");
//        Set<Location> locations = new HashSet<>();
//        Location location1 = new Location(1, "flagstaff", "arizona", "us", "86004");
//        Location location2 = new Location(2, "albany", "newyork", "us", "10000");
//        locations.add(location1);
//        locations.add(location2);
//        AppUser appUser = new AppUser(1L, "seanrog", "pw1", "sean1", "rog1", "sr1@gmail.com", "10000", appUserRole, locations, location1);
//
//        appUserRepository.save(appUser);

        SpringApplication.run(AppDriver.class, args);
    }

}
