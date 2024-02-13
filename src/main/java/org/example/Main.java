package org.example;

import org.example.entity.City;
import org.example.redis.CityCountry;
import org.example.redis.RedisManager;
import org.example.service.MySessionFactory;
import org.example.service.ServiceManager;
import org.hibernate.SessionFactory;

import java.util.List;


public class Main {
    public static void main(String[] args) {

        SessionFactory sessionFactory = MySessionFactory.prepareRelationalDb();
        ServiceManager serviceManager = new ServiceManager(sessionFactory);

        RedisManager redisManager = new RedisManager();

        List<City> allCities = serviceManager.fetchData();
        List<CityCountry> preparedData = serviceManager.transformData(allCities);
        redisManager.pushToRedis(preparedData);

        sessionFactory.getCurrentSession().close();

        List<Integer> ids = List.of(3, 2545, 123, 4, 189, 89, 3458, 1189, 10, 102);

        long startRedis = System.currentTimeMillis();
        redisManager.testRedisData(ids);
        long stopRedis = System.currentTimeMillis();

        long startMysql = System.currentTimeMillis();
        serviceManager.testMysqlData(ids);
        long stopMysql = System.currentTimeMillis();

        System.out.printf("%s:\t%d ms\n", "Redis", (stopRedis - startRedis));
        System.out.printf("%s:\t%d ms\n", "MySQL", (stopMysql - startMysql));


        redisManager.shutdown();
    }
}