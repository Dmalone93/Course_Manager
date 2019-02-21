package com.example.codeclan.coursemanager.repositories.CourseRepositories;

import com.example.codeclan.coursemanager.models.Course;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface CourseRepositoryCustom {

    List<Course> findCourseByCustomer(Long customerId);


}
