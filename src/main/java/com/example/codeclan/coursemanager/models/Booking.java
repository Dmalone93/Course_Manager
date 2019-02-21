package com.example.codeclan.coursemanager.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name="bookings")

public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonIgnoreProperties(value="bookings")
    @ManyToOne
    @JoinColumn(name="course_id", nullable = false)
    private Course course;
    @JsonIgnoreProperties(value="bookings")
    @ManyToOne
    @JoinColumn(name="customer_id", nullable = false)
    private Customer customer;

    @Column
    private String date;

    public Booking(String date, Customer customer, Course course) {
        this.date = date;
        this.customer = customer;
        this.course = course;
    }


    public String getDate() {
        return date;
    }

    public Booking() {
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
