package org.example;


import org.example.service.MySessionFactory;
import org.example.service.ServiceManager;
import org.hibernate.SessionFactory;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = MySessionFactory.prepareRelationalDb();
        ServiceManager serviceManager = new ServiceManager(sessionFactory);
        serviceManager.fetchData();

    }
}