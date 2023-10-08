package ru.zinovev.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.zinovev.Hibernate.entity.Employee;

public class AppHibernate {
    public static void main(String[] args) {
        addPerson();
    }

    private static void addPerson() {
        try (SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()
        ) {
            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();
            session.persist(new Employee("Demyan", "Voronin", "HR", 50000));
            session.getTransaction().commit();
            session.close();
        }
    }

}
