package com.pssc.hph.flights.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_booking")
    private int id_booking;
    @Column(name = "from")
    private String from;
    @Column(name = "to")
    private String to;
    @Column(name = "price_old")
    private double price_old;
    @Column(name = "price_new")
    private double price_new;
    @Column(name = "date_year")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate date_year;
    @Column(name = "date_hour")
    private String date_hour;
    @Column(name = "traveltime")
    private String travel_time;
    @OneToMany
    @JsonIgnore
    private List<Airplane> airplane;
}
