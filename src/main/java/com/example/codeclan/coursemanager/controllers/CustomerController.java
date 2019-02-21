package com.example.codeclan.coursemanager.controllers;

import com.example.codeclan.coursemanager.models.Customer;
import com.example.codeclan.coursemanager.repositories.CutomerRepositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value = "/course/{courseId}")
    public List<Customer> findCustomerByItsCourses(@PathVariable Long courseId){
        return customerRepository.findCustomerByCourse(courseId);
    }

    @GetMapping(value = "/course/town/{town}")
    public List<Customer> findCustomerbyCourseTown(@PathVariable String town){
        return customerRepository.findCustomerByCoursesTown(town);
    }
}
