package cgg.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cgg.spring.orm.config.configFile;
import cgg.spring.orm.dao.Studentdao;
import cgg.spring.orm.dao.StudentdaoImpl;
import cgg.spring.orm.entities.Student;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        // AnnotationConfigApplicationContext context = new
        // AnnotationConfigApplicationContext(configFile.class);
        Studentdao studentDao = context.getBean(Studentdao.class);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean go = true;
        while (go) {
            System.out.println("PRESS 1 for add new student");
            System.out.println("PRESS 2 for display all students");
            System.out.println("PRESS 3 get detail of single student");
            System.out.println("PRESS 4 for delete student");
            System.out.println("PRESS 5 for update student");
            System.out.println("PRESS 6 for exit");

            try {

                int input = Integer.parseInt(br.readLine());
                switch (input) {
                    case 1:
                        // add a new student
                        System.out.println("Enter user id: ");
                        int uId = Integer.parseInt(br.readLine());

                        System.out.println("Enter user name: ");
                        String UName = br.readLine();

                        System.out.println("Enter user city: ");
                        String uCity = br.readLine();

                        Student student = new Student();
                        student.setId(uId);
                        student.setName(UName);
                        student.setCity(uCity);

                        int r = studentDao.createStudent(student);
                        System.out.println(r + " student added");
                        System.out.println("************************************");
                        System.out.println();
                        break;
                    // case 2:
                    // // display all students
                    // List<Student> allStudents = studentDao.getallstud();
                    // for (Student st : allStudents) {
                    // System.out.println("Id : " + st.getId());
                    // System.out.println("Name : " + st.getName());
                    // System.out.println("City : " + st.getCity());
                    // System.out.println("______________________________________");
                    // }
                    // System.out.println("**********************************************");
                    // break;
                    // case 3:
                    // // get single student data
                    // System.out.println("Enter user id: ");
                    // int userId = Integer.parseInt(br.readLine());
                    // Student std = studentDao.getstudbyid(userId);
                    // System.out.println("Id : " + std.getId());
                    // System.out.println("Name : " + std.getName());
                    // System.out.println("City : " + std.getCity());
                    // System.out.println("______________________________________");
                    // break;
                    // case 4:
                    // // delete student
                    // System.out.println("Enter user id: ");
                    // int id = Integer.parseInt(br.readLine());
                    // studentDao.delete(id);
                    // System.out.println("Student deleted.....");
                    // break;
                    // case 5:
                    // // update student
                    // break;

                    case 6:
                        // exit
                        go = false;
                        break;
                }

            } catch (Exception e) {
                System.out.println("Invalid input try with another one !!");
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Thankyou for using my application");
        System.out.println("See you soon !!");
    }
}
