package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Employee;

public class Update {

    public static void main(String[] args) {

        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");

        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();

        Transaction tx = session.beginTransaction();

        Employee employee = session.get(Employee.class, 6);

        if (employee != null) {

            employee.setName("Kareena Kapoor");
            employee.setSalary(50000);

            session.update(employee);

            System.out.println("Employee updated");

        } else {
            System.out.println("Employee not found");
        }

        tx.commit();

        session.close();
        factory.close();

        System.out.println("Thank YOU");
    }
}