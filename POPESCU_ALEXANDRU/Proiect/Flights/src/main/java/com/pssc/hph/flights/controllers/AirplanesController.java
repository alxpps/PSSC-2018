package com.pssc.hph.flights.controllers;

import com.pssc.hph.flights.entities.Airplane;
import com.pssc.hph.flights.services.AirplaneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/home/airplane")
public class AirplanesController {

    private  AirplaneService airplaneService;

    @Autowired
    public AirplanesController( AirplaneService airplaneService){
        this.airplaneService = airplaneService;
    }

    @GetMapping("/all")
    public List<Airplane> getAirplanes(){
        return airplaneService.getAllAirplanes();
    }

    @PostMapping("/add")
    public void addAirplane(@RequestBody Airplane airplane){
        airplaneService.addAirplane(airplane);
    }

    @PutMapping("/booked/{id}")
    public Airplane updateById(@RequestBody Airplane airplane, @PathVariable int id){
        return airplaneService.updateAirplaneById(airplane, id);
    }
}
