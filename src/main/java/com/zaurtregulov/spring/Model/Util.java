package com.zaurtregulov.spring.Model;

import com.zaurtregulov.spring.Enty.Enty;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import java.util.Properties;

public class Util {
    private static final String URL = "jdbc:mysql://localhost:3306/my_first_bd";
    private static final String USERNAME = "root";
    private static final String PASWD = "123456789";
    private static SessionFactory sessionFactory = null;
    public static SessionFactory session() {
        Configuration configuration = new Configuration();
        //Properties properties = new Properties();
        configuration.setProperty(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
        configuration.setProperty(Environment.URL, URL);
        configuration.setProperty(Environment.USER, USERNAME);
        configuration.setProperty(Environment.PASS, PASWD);
        configuration.setProperty(Environment.SHOW_SQL, "true");
//        configuration.setProperty(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
        configuration.addAnnotatedClass(Enty.class);

        sessionFactory = configuration.buildSessionFactory();
        if (sessionFactory == null) {
            throw new NullPointerException("Not session factory");
        }
        //Session session = sessionFactory.openSession();
        return sessionFactory;
    }
    public static void closeFactory() {
        if (sessionFactory != null) {
            sessionFactory.close();
            System.out.println("Close ok");
        }
    }
}
