package org.example.service;

import org.example.entity.City;
import org.example.entity.Country;
import org.example.entity.CountryLanguage;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import static java.util.Objects.nonNull;

public class MySessionFactory {
    private static MySessionFactory instance;
    private final SessionFactory sessionFactory;

    private MySessionFactory() {
        sessionFactory = new Configuration()
                .addAnnotatedClass(City.class)
                .addAnnotatedClass(Country.class)
                .addAnnotatedClass(CountryLanguage.class)
                .configure("hibernate_mysql.cfg.xml")
                .buildSessionFactory();
    }
    public static SessionFactory prepareRelationalDb(){
        if (instance == null) {
            instance = new MySessionFactory();
        }
        return instance.sessionFactory;
    }

//    private void shutdown() {
//        if (nonNull(sessionFactory)) {
//            sessionFactory.close();
//        }
//        if (nonNull(redisClient)) {
//            redisClient.shutdown();
//        }
//    }
}
