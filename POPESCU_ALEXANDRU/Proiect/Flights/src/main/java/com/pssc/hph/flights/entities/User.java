package com.pssc.hph.flights.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.pssc.hph.flights.models.Role;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 50, nullable = false)
    private String firstName;
    @Column(length = 50, nullable = false)
    private String lastName;
    @JsonIgnore
    private String password;
    @Enumerated(EnumType.STRING)
    @ElementCollection(fetch = FetchType.EAGER)
    private List<Role> roles;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;
 //   @JsonIgnore
 //   @OneToMany(mappedBy = "patient")
 //   private List<Appointment> patientAppointments;
 //   @JsonIgnore
 //   @OneToMany(mappedBy = "doctor")
 //  private List<Appointment> doctorAppointments;



}
