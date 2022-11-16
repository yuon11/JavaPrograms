package school;


import org.example.Student;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> allCourses= new ArrayList<String>();
        allCourses.add("Gym");
        allCourses.add("Math");
        allCourses.add("Earth Science");
        allCourses.add("Social Studies");
        allCourses.add("Biology");
        allCourses.add("Physics");

        school.NewStudent student1 = new NewStudent("Tommy");
        NewStudent student2 = new NewStudent("Chuckie", 3.0, "Math","Physics", "Biology", "Gym");

        NewStudent student3 = new NewStudent("Lillian", 2.9, allCourses);
        NewStudent student4 = new NewStudent("Phillip", 2.5, allCourses);

        student2.addCourse("Biology");

        student3.addCourse("Earth Science");
        student3.addCourse("Gym");

        student4.addCourse("Earth Science");
        student4.addCourse("Gym");

        try {
            System.out.println("CREATING A STUDENT WITH Blank Name");
            NewStudent jim = new NewStudent("", 0.1);

        } catch (IllegalArgumentException ie) {
            System.out.println("Ooops, Creating a blank student doesn't seem to work");
        }

        try {
            System.out.println("CREATING A STUDENT WITH negative GPA");
            NewStudent jim = new NewStudent("Jim", -0.1);

        } catch (IllegalArgumentException ie) {
            System.out.println("Ooops, Creating a negative GPA student doesn't seem to work");
        }


        System.out.println("Program still running!");
        NewStudent.printStudents();
//        school.Student student1 = new Student("Tommy");
//        Student student2 = new Student("Chuckie", 3.0);
//        Student student3 = new Student("Lillian", 2.9);
//        Student student4 = new Student("Phillip", 2.5);
//
//        student1.addCourse("Math");
//        student1.addCourse("Gym");
//
//        student2.addCourse("Biology");
//
//        student3.addCourse("Earth Science");
//        student3.addCourse("Gym");
//
//        student4.addCourse("Earth Science");
//        student4.addCourse("Gym");
//
//        try {
//            System.out.println("CREATING A STUDENT WITH Blank Name");
//            Student jim = new Student("", 0.1);
//
//        } catch (IllegalArgumentException ie) {
//            System.out.println("Ooops, Creating a blank student doesn't seem to work");
//        }
//
//        try {
//            System.out.println("CREATING A STUDENT WITH negative GPA");
//            Student jim = new Student("Jim", -0.1);
//
//        } catch (IllegalArgumentException ie) {
//            System.out.println("Ooops, Creating a negative GPA student doesn't seem to work");
//        }
//
//
//        System.out.println("Program still running!");
//        Student.printStudents();
    }
}
