package com.example.codeclan.coursemanager.controllers;

import com.example.codeclan.coursemanager.models.Course;
import com.example.codeclan.coursemanager.repositories.CourseRepositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/courses")
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @GetMapping(value = "/{rating}")
    public List<Course> findCoursesByItsRating(@PathVariable double rating){
        return courseRepository.findCourseByRating(rating);
    }

    @GetMapping(value = "/customer/{customerId}")
    public List<Course> findCourseByItsCustomer(@PathVariable Long customerId){
        return courseRepository.findCourseByCustomer(customerId);
    }
}
