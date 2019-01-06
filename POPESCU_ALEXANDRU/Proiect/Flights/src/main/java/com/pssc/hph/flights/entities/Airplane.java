package com.pssc.hph.flights.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Airplane {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_airplane")
    private int id;
    @Column(name = "places")
    private double places;

}
