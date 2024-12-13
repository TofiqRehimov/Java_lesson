package generics;

import java.util.ArrayList;
import java.util.List;

public class Students  {
    private String studentName;
    private int studentID;
    List<String> course = new ArrayList<String>();
    public Students() {}
    public Students(String studentName, int studentID) {
        this.studentName = studentName;
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
    public  void addCourse(String course) { this.course.add(course) ;}

    public void displayInfo(){
        System.out.println("Student Name: " + studentName + ", Student ID: " + studentID);
    }
    @Override
    public String toString() {
        return "Students{" +
                "studentName='" + studentName + '\'' +
                ", studentID=" + studentID +
                ", course=" + course +
                '}';
    }
}
