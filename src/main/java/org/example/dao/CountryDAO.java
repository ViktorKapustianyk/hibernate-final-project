package org.example.dao;

import org.example.entity.Country;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

public class CountryDAO extends AbstractHibernateDao<Country>{
    public CountryDAO(SessionFactory sessionFactory) {
        super(Country.class, sessionFactory);
    }
    public List<Country> getAll() {
        Query<Country> query = getCurrentSession().createQuery("select c from Country c join fetch c.languages", Country.class);
        return query.list();
    }
}
