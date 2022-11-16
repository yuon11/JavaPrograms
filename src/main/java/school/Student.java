package school;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class Student {

    // Syntax looked up on Tutorial Point
    // Types like Enumeration and Vector looked up
    public String name;
    public double GPA;
    public List<String> courses;

    public static List<Student> StudentDirectory = new ArrayList();

    public boolean isOnHonorRoll;

    public Student (String stdName) {
        setGPA(0.0);
        this.name = stdName;
        this.courses = new ArrayList();
        StudentDirectory.add(this);
    }

    public Student (String stdName, double GPA) {
        setGPA(GPA);
        setName(stdName);

        this.courses = new ArrayList();
        StudentDirectory.add(this);
    }

    public String getName(){
        return this.name;
    }
    public void setName(String stdName){
        if (stdName != null && stdName.length() > 0) {
            this.name=stdName;
        }else {
            throw new IllegalArgumentException("Bad name for Student");
        }
    }


    public double getGPA() {
        return this.GPA;
    }
    public void setGPA(double stdGpa) {
        if (stdGpa <= 4.0 && stdGpa >= 0.0) {
            this.GPA = stdGpa;
            // Ensure student is updated when GPA is changed
            setOnHonorRoll();
        }else {
            throw new IllegalArgumentException("Bad gpa for Student");
        }
    }


    public List<String> getCourse() {
        // should maybe make a copy and return it
        return this.courses;
    }

    public void setCourse(String courseName, int index) {
        if (this.courses != null && this.courses.size() >= index) {
            this.courses.set(index, courseName);
        }
    }

    public void addCourse(String courseName) {
        if (courseName != null && courseName.length() > 0) {
            this.courses.add(courseName);
        }else {
            throw new IllegalArgumentException("Bad name for Course");
        }
    }

    // This method prints the Student details.
    public void printStud() {
        System.out.print("Name: " + name );
        System.out.print(" | GPA:" + GPA+" | ");
        printCourses();
        System.out.println("\t");
    }

    // This method prints the Course details.
    public void printCourses() {
        System.out.print(this.courses);
    }

    // used to set honor roll
    private void setOnHonorRoll() {
        if (GPA >= 3.0) {
            isOnHonorRoll=true;
        }else {
            isOnHonorRoll=false;
        }
    }

    public static void printStudents(){
        for (Student student: StudentDirectory) {
            student.printStud();
        }
    }
}
