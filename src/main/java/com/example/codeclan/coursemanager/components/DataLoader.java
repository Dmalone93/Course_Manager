package com.example.codeclan.coursemanager.components;

import com.example.codeclan.coursemanager.models.Booking;
import com.example.codeclan.coursemanager.models.Course;
import com.example.codeclan.coursemanager.models.Customer;
import com.example.codeclan.coursemanager.repositories.BookingRepositories.BookingRepository;
import com.example.codeclan.coursemanager.repositories.CourseRepositories.CourseRepository;
import com.example.codeclan.coursemanager.repositories.CutomerRepositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BookingRepository bookingRepository;
    @Autowired
    CourseRepository courseRepository;
    @Autowired
    CustomerRepository customerRepository;

    public DataLoader() {
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Customer customer1 = new Customer("Declan", "Glasgow", 25);
        customerRepository.save(customer1);

        Customer customer2 = new Customer("Megan", "Mearns", 26);
        customerRepository.save(customer2);

        Customer customer3 = new Customer("Steven", "Clydebank", 24);
        customerRepository.save(customer3);

        Customer customer4 = new Customer("Andrew", "Cambuslang", 24);
        customerRepository.save(customer4);

        Customer customer5 = new Customer("George", "Perth", 30);
        customerRepository.save(customer5);

        Course course1 = new Course("Java","Edinburgh", 5.0);
        courseRepository.save(course1);

        Course course2 = new Course("Ruby","Glasgow", 4.0);
        courseRepository.save(course2);

        Course course3 = new Course("Spring","Dundee", 3.0);
        courseRepository.save(course3);


        Booking booking1 = new Booking("12-10-2019", customer1, course1);
        bookingRepository.save(booking1);

        Booking booking2 = new Booking("11-10-2019", customer2, course2);
        bookingRepository.save(booking2);

        Booking booking3 = new Booking("13-10-2019", customer3, course3);
        bookingRepository.save(booking3);

    }
}
