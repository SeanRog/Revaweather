package com.vertigo.controllers;

import com.vertigo.entities.Location;
import com.vertigo.services.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/locations")
public class LocationController {

    @Autowired
    private LocationService locationService;

    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Location> getAllLocations() {
        return locationService.findAll();
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Location saveLocation(@RequestBody Location location) {

        return locationService.save(location);

    }


}
