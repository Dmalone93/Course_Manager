package com.example.codeclan.coursemanager.controllers;


import com.example.codeclan.coursemanager.models.Booking;
import com.example.codeclan.coursemanager.repositories.BookingRepositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/bookings")
public class BookingController {

    @Autowired
    BookingRepository bookingRepository;

    @GetMapping(value = "/booking/{date}")
    public List<Booking> findBookingByitsDay(@PathVariable String date){
        return bookingRepository.findBookingByDay(date);
    }

}
