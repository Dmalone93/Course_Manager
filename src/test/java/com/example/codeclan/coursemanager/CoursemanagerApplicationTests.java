package com.example.codeclan.coursemanager;

import com.example.codeclan.coursemanager.models.Booking;
import com.example.codeclan.coursemanager.models.Course;
import com.example.codeclan.coursemanager.models.Customer;
import com.example.codeclan.coursemanager.repositories.BookingRepositories.BookingRepository;
import com.example.codeclan.coursemanager.repositories.CourseRepositories.CourseRepository;
import com.example.codeclan.coursemanager.repositories.CutomerRepositories.CustomerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CoursemanagerApplicationTests {

	@Autowired
	BookingRepository bookingRepository;
	@Autowired
	CourseRepository courseRepository;
	@Autowired
	CustomerRepository customerRepository;



	@Test
	public void contextLoads() {
	}

	@Test
	public void canSaveCustomer() {
		Customer customer = new Customer("Declan", "Cambuslang", 25);
		customerRepository.save(customer);
	}

	@Test
	public void canSaveCourse(){
		Course course = new Course("Ruby", "Glasgow", 5.0);
		courseRepository.save(course);
	}

	@Test
	public void canSaveBooking() {
		Customer customer = new Customer("Declan", "Cambuslang", 25);
		customerRepository.save(customer);
		Course course = new Course("Ruby", "Glasgow", 5.0);
		courseRepository.save(course);
		Booking booking = new Booking("10/12/2019", customer, course);
		bookingRepository.save(booking);
	}

	@Test
	public void canGetCustomerFromCourse(){
		List<Course> results = courseRepository.findCourseByCustomer(1L);
		assertEquals(1, results.size());
	}

	@Test
	public void canGetCourseFromCustomer(){
		List<Customer> results = customerRepository.findCustomerByCourse(1L);
		assertEquals(1, results.size());
	}

	@Test
	public void canFindBookingByDate() {
		List<Booking> bookings = bookingRepository.findBookingByDay("12/10/2019");
		assertEquals(1, bookings.size());
	}
}
