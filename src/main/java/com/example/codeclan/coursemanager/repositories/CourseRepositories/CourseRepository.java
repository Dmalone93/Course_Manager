package com.example.codeclan.coursemanager.repositories.CourseRepositories;

import com.example.codeclan.coursemanager.models.Course;
import com.example.codeclan.coursemanager.repositories.CutomerRepositories.CustomerRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@RepositoryRestResource
public interface CourseRepository extends JpaRepository<Course, Long>, CourseRepositoryCustom {

    List<Course> findCourseByRating(double rating);
}
