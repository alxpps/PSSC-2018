package com.pssc.hph.flights.controllers;

import com.pssc.hph.flights.entities.Booking;
import com.pssc.hph.flights.services.BookingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/home/bookings")
public class BookingsController {

    @Autowired
    BookingsService bookingsService;

    @GetMapping()
    public List<Booking> getAll(){
       return bookingsService.getAllBookings();
    }

    @PostMapping("/add/booking")
    public void addBooking(@RequestBody Booking booking){
        bookingsService.addBooking(booking);
    }
}
