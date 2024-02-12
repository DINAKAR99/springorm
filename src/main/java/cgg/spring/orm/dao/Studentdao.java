package cgg.spring.orm.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import cgg.spring.orm.entities.Student;

public interface Studentdao {
    int createStudent(Student s);

    // void update(Student s);

    // void delete(int s);

    // Student getstudbyid(int s);

    // List<Student> getallstud();

}
