package org.example.dao;

import org.example.entity.City;
import org.hibernate.query.Query;
import org.hibernate.SessionFactory;
public class CityDAO extends AbstractHibernateDao<City>{
    public CityDAO(SessionFactory sessionFactory) {
        super(City.class, sessionFactory);
    }
    public int getTotalCount() {
        Query<Long> query = getCurrentSession().createQuery("select count(c) from City c", Long.class);
        return Math.toIntExact(query.uniqueResult());
    }

    public City getCityById(Integer id) {
        Query<City> query = getCurrentSession().createQuery("select c from City c join fetch c.country where c.id = :ID", City.class);
        query.setParameter("ID", id);
        return query.getSingleResult();
    }
}
