package com.example.codeclan.coursemanager.projections;
import com.example.codeclan.coursemanager.models.Booking;
import com.example.codeclan.coursemanager.models.Course;
import com.example.codeclan.coursemanager.models.Customer;
import org.springframework.data.rest.core.config.Projection;

@Projection(name="EmbeddedDates", types = Booking.class)
public interface EmbeddedDate {

    String getDate();
    Customer getCustomer();
    Course getCourse();
}
