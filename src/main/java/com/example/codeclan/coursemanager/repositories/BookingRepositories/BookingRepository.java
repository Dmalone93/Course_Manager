package com.example.codeclan.coursemanager.repositories.BookingRepositories;

import com.example.codeclan.coursemanager.models.Booking;
import com.example.codeclan.coursemanager.projections.EmbeddedDate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@RepositoryRestResource(excerptProjection = EmbeddedDate.class)
public interface BookingRepository extends JpaRepository<Booking, Long>, BookingRepositoryCustom {
    List<Booking> findBookingsByDate(String s);
}
