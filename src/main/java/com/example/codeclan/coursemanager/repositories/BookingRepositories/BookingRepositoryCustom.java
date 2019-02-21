package com.example.codeclan.coursemanager.repositories.BookingRepositories;

import com.example.codeclan.coursemanager.models.Booking;

import java.util.List;

public interface BookingRepositoryCustom {

    List<Booking> findBookingByDay(String date);
}
