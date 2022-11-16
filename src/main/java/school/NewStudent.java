package school;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class NewStudent {

    private String name;
    private double gpa;
    private ArrayList<String> courses;
    public static ArrayList<NewStudent> StudentDirectory = new ArrayList();
    public boolean isOnHonorRoll;

    //
    // Initializers
    //
    public NewStudent (String stdName) {
        setGpa(0.0);
        this.name = stdName;
        this.courses = new ArrayList();
        StudentDirectory.add(this);
    }

    // Just GPA and name
    public NewStudent (String stdName, double GPA) {

        setGpa(GPA);
        setName(stdName);
        this.courses = new ArrayList();
        StudentDirectory.add(this);
    }

    // intitialize students with all attributes
    public NewStudent (String stdName, double GPA, String ... courses) {

        setGpa(GPA);
        setName(stdName);
        setCourses(courses);
        StudentDirectory.add(this);
    }

    // intitialize students with all attributes
    public NewStudent (String stdName, double GPA, ArrayList<String> courses) {

        setGpa(GPA);
        setName(stdName);
        setCourses(courses);
        StudentDirectory.add(this);
    }

    //
    // SET NAME
    //
    public void setName(String name) {

        if (name != null && name.length() > 0) {
            this.name = name;
        }else {
            throw new IllegalArgumentException("Bad name for Student");
        }
    }

    //
    //
    //
    public String getName() {
        return name;
    }

    //
    //
    //
    public void setGpa(double gpa) {

        if (gpa <= 4.0 && gpa >= 0.0) {
            this.gpa = gpa;
            setOnHonorRoll();
        }else {
            throw new IllegalArgumentException("Bad GPA for Student");
        }
    }
    //
    //
    //
    public double getGpa() {
        return gpa;
    }

    //
    // Replace old course list for student
    //
    public void setCourses(ArrayList<String> courses) {
        this.courses = courses;
    }
    public void setCourses(String ... courses) {
        this.courses = new ArrayList<String>(Arrays.asList(courses));
    }

    //
    //
    //
    public ArrayList<String> getCourses() {
        return courses;
    }

    // Update index of course list with new course
    public void updateCourse(String courseName, int index) {
        if (this.courses != null && this.courses.size() >= index) {
            this.courses.set(index, courseName);
        }
    }

    //
    public void addCourse(String courseName) {
        if (this.courses != null && courseName != null && courseName.length() > 0) {
            this.courses.add(courseName);
        }else {
            throw new IllegalArgumentException("Cant add course to student course list");
        }
    }

    //
    //
    //
    @Override
    public String toString() {
        return "NewStudent{" +
                "name='" + getName() + '\'' +
                ", gpa=" + getGpa() +
                ", courses=" + getCourses() +
                '}';
    }

    private void setOnHonorRoll() {
        if (this.gpa >= 3.0) {
            this.isOnHonorRoll=true;
        }else {
            this.isOnHonorRoll=false;
        }
    }

    public static void printStudents(){
        for (NewStudent student: StudentDirectory) {
            System.out.println(student.toString());
        }
    }

}
