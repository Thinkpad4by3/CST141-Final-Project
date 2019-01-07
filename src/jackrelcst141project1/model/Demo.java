/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jackrelcst141project1.model;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Jasoni7
 */
public class Demo {
    public Demo() throws IOException {
        /*Scanner input = new Scanner(System.in);
        StudentBag student1 = new StudentBag(99);
        student1.importText("C:\\test\\student.txt");
        FacultyBag faculty1 = new FacultyBag(99);
        faculty1.importText("C:\\test\\faculty.txt");
        PersonBag person1 = new PersonBag(99);
        person1.importText("C:\\test\\person.txt");
        System.out.println();
        System.out.println();
        student1.display();
        System.out.println();
        System.out.println();
        person1.display();
        System.out.println();
        System.out.println();
        faculty1.display();
        System.out.println();
        System.out.println();
        CourseBag course1 = new CourseBag(99);
        TextbookBag textbook1 = new TextbookBag(99);
        Textbook test = new Textbook("Java Book","Phil Collins","BestBuy","654855454545484",98.50);
        textbook1.add(test);
                System.out.println();

        textbook1.display();
                System.out.println();

        Student stu1 = new Student(student1.findbyId("1024"));
        System.out.println(stu1.getFirstName() + " " + stu1.getLastName());
        System.out.println();
        System.out.println();
        student1.display();
        student1.removeById("125");
        System.out.println();
        System.out.println();
        student1.display();
        course1.importText("C:\\test\\course.txt");
        textbook1.importText("C:\\test\\textbook.txt");*/
        BodyBag bag1 = new BodyBag(99);
        bag1.importStudents("C:\\test\\student.txt");
        bag1.importFaculty("C:\\test\\faculty.txt");
        Faculty person1 = new Faculty();
        bag1.addPerson(person1);
        Student student1 = new Student();
        bag1.addPerson(student1);
        bag1.displayFacultyInOrder();
        bag1.displayStudentsInOrder();
        bag1.printFacultyInOrder("C:\\test\\printfaculty.txt");
        bag1.printStudentsInOrder("C:\\test\\printstudents.txt");
    }
}
