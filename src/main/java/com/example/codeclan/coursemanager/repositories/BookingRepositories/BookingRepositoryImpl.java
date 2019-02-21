package com.example.codeclan.coursemanager.repositories.BookingRepositories;

import com.example.codeclan.coursemanager.models.Booking;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class BookingRepositoryImpl implements BookingRepositoryCustom {

    @Autowired
    EntityManager entityManager;
@Transactional
    public List<Booking> findBookingByDay(String date){
        List<Booking> results = null;
        Criteria cr = null;
        try {
        Session session = entityManager.unwrap(Session.class);
        cr = session.createCriteria(Booking.class);
        cr.add(Restrictions.eq("date", date));
    } catch (
    HibernateException e) {
        e.printStackTrace();
    }

    results = cr.list();
        return results;

    }
}
