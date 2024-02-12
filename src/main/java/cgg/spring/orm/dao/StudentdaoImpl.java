package cgg.spring.orm.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import cgg.spring.orm.entities.Student;

@Component("daoImpl")
public class StudentdaoImpl implements Studentdao {

    // private SessionFactory h1;
    // private HibernateTemplate h1;

    @PersistenceContext
    private EntityManager h1;

    // public StudentdaoImpl(HibernateTemplate h1) {
    // this.h1 = h1;
    // }
    // public StudentdaoImpl(SessionFactory h1) {
    // this.h1 = h1;
    // }

    public EntityManager getH1() {
        return h1;
    }

    public StudentdaoImpl() {
    }

    public StudentdaoImpl(EntityManager h1) {
        this.h1 = h1;
    }

    public void setH1(EntityManager h1) {
        this.h1 = h1;
    }

    @Override
    @Transactional
    public int createStudent(Student s) {

        // int save = (int) h1.save(s);
        h1.persist(s);
        return 1;

    }

    // @Override
    // @Transactional
    // public void update(Student s) {

    // h1.update(s);

    // }

    // @Override
    // @Transactional
    // public void delete(int s) {
    // Student student = h1.get(Student.class, s);
    // h1.delete(student);
    // }

    // @Override
    // @Transactional
    // public Student getstudbyid(int s) {

    // Student student = h1.get(Student.class, s);

    // return student;
    // }

    // @Override
    // @Transactional
    // public List<Student> getallstud() {

    // List<Student> all = h1.loadAll(Student.class);

    // return all;

    // }

}
