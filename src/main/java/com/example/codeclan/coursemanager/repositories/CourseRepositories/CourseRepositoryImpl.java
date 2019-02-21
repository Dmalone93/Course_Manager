package com.example.codeclan.coursemanager.repositories.CourseRepositories;
import com.example.codeclan.coursemanager.models.Course;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class CourseRepositoryImpl implements CourseRepositoryCustom {

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Course> findCourseByCustomer(Long customerId){
        List<Course> results = null;

        Criteria cr = null;
        try {
            Session session = entityManager.unwrap(Session.class);
            cr = session.createCriteria(Course.class);
            cr.createAlias("bookings", "booking");
            cr.createAlias("booking.customer", "customer");
            cr.add(Restrictions.eq("customer.id", customerId));
        } catch (HibernateException e) {
            e.printStackTrace();
        }

        results = cr.list();
        return results;
    }
}
