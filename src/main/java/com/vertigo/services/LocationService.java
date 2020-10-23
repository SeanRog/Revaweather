package com.vertigo.services;

import com.vertigo.entities.Location;
import com.vertigo.repositories.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class LocationService {

    @Autowired
    private LocationRepository locationRepository;

    @Transactional
    public List<Location> findAll() {
        Iterable<Location> locationIterable = locationRepository.findAll();
        List<Location> locationList = new ArrayList<>();
        locationIterable.forEach(locationList::add);
        return locationList;
    }

    @Transactional
    public Location save(Location location) {

        if(location == null) {

            throw new RuntimeException("Location is null in LocationService");

        }

        location = locationRepository.save(location);
        return location;

    }

}
