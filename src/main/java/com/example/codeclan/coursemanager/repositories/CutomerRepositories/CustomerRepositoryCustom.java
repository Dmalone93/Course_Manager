package com.example.codeclan.coursemanager.repositories.CutomerRepositories;

import com.example.codeclan.coursemanager.models.Customer;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface CustomerRepositoryCustom {

    List<Customer> findCustomerByCourse(Long courseId);
    List<Customer> findCustomerByCoursesTown(String town);
}
