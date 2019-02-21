package com.example.codeclan.coursemanager.repositories.CutomerRepositories;

import com.example.codeclan.coursemanager.models.Customer;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepositoryCustom {

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Customer> findCustomerByCourse(Long courseId){
        List<Customer> results = null;

        Criteria cr = null;
        try {
            Session session = entityManager.unwrap(Session.class);
            cr = session.createCriteria(Customer.class);
            cr.createAlias("bookings", "booking");
            cr.add(Restrictions.eq("booking.course.id", courseId));
        } catch (HibernateException e) {
            e.printStackTrace();
        }

        results = cr.list();
        return results;
    }

    @Transactional
    public List<Customer> findCustomerByCoursesTown(String town){
        List<Customer> results = null;

        Criteria cr = null;
        try {
            Session session = entityManager.unwrap(Session.class);
            cr = session.createCriteria(Customer.class);
            cr.createAlias("bookings", "booking");
            cr.createAlias("booking.course", "course");
            cr.add(Restrictions.eq("course.town", town));
        } catch (HibernateException e) {
            e.printStackTrace();
        }

        results = cr.list();
        return results;
    }

    @Transactional
    public List<Customer> findCustomerByAgeAndCoursesTown(String town){
        List<Customer> results = null;

        Criteria cr = null;
        try {
            Session session = entityManager.unwrap(Session.class);
            cr = session.createCriteria(Customer.class);
            cr.createAlias("bookings", "booking");
            cr.createAlias("booking.course", "course");
            cr.add(Restrictions.eq("course.town", town));
        } catch (HibernateException e) {
            e.printStackTrace();
        }

        results = cr.list();
        return results;
    }
}
