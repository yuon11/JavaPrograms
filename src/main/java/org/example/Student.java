package org.example;

import java.util.Enumeration;
import java.util.Vector;

public class Student {

    // Syntax looked up on Tutorial Point
    // Types like Enumeration and Vector looked up
    public String name;
    public double GPA;
    public Vector courses;

    public boolean isOnHonorRoll;

    public Student (String stdName) {
        name = stdName;
        setGPA(0.0);
        courses = new Vector();
    }

    public void setGPA(double stdGpa) {
         if (stdGpa <= 4.0 && stdGpa >= 0.0) {
             GPA = stdGpa;
         }
         // Ensure student is updated when GPA is changed
        setOnHonorRoll();
    }

    public void setCourse(String courseName) {
        courses.add(courseName);
    }

    // This method prints the Student details.
    public void printStud() {
        System.out.println("\nName  : " + name );
        System.out.println("GPA :" + GPA);
        printCourses();
    }

    // This method prints the Course details.
    public void printCourses() {
        Enumeration classes = courses.elements();
        while (classes.hasMoreElements()) {
            System.out.println(classes.nextElement());
        }
        System.out.println("\n");
    }

    public void setOnHonorRoll() {
        if (GPA >= 3.0) {
            isOnHonorRoll=true;
        }else {
            isOnHonorRoll=false;
        }
    }


    public static void main(String args[]) {
        Student student1 = new Student("Tommy");
        Student student2 = new Student("Chuckie");
        Student student3 = new Student("Lillian");
        Student student4 = new Student("Phillip");

        student1.setCourse("Math");
        student1.setCourse("Gym");

        student2.setCourse("Biology");

        student3.setCourse("Earth Science");
        student3.setCourse("Gym");

        student4.setCourse("Earth Science");
        student4.setCourse("Gym");

        student1.setGPA(3.0);
        student2.setGPA(3.5);
        student3.setGPA(2.9);
        student4.setGPA(1.9);

        student1.printStud();
        student2.printStud();
        student3.printStud();
        student4.printStud();

        Student[] classStudents = {student1, student2, student3, student4};

        System.out.println("\n------------------HONOR ROLL STUDENTS--------------------");
        for (Student student : classStudents) {
            if (student.isOnHonorRoll) {
                System.out.println(student.name);
            }
        }
        System.out.println("------------------HONOR ROLL STUDENTS--------------------");
    }
}