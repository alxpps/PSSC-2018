package com.pssc.hph.flights.services;

import com.pssc.hph.flights.entities.Airplane;
import com.pssc.hph.flights.repositories.AirplaneRepository;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class AirplaneService {

    private AirplaneRepository airplaneRepository;

    @Autowired
    public AirplaneService(AirplaneRepository airplaneRepository) {
        this.airplaneRepository = airplaneRepository;
    }

    public List<Airplane> getAllAirplanes(){
        return airplaneRepository.findAll();
    }

    public void addAirplane(Airplane airplane){
        airplaneRepository.save(airplane);
    }

    public Airplane updateAirplaneById(Airplane airplane, int id){

        val airplane1 = airplaneRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Could not find the trip"));

        airplane1.setPlaces(airplane.getPlaces());

        return airplaneRepository.save(airplane1);
    }
}
