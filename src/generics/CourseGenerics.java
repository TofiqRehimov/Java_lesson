package generics;

import java.util.ArrayList;

public class CourseGenerics  <T>{
    private  String courseName;
    private Subject subject;
    private ArrayList<T> students;

    public CourseGenerics(String courseName, Subject subject) {
        this.courseName = courseName;
        this.subject = subject;
        this.students = new ArrayList<>();
    }

    public String getcourseName() {
        return courseName;
    }

    public void setcourseName(String courseName) {
        this.courseName = courseName;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public ArrayList<T> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<T> students) {
        this.students = students;
    }
    public void addStudent(T student) {
        this.students.add(student);

    }
 public void displayInfoCourse() {
        System.out.println("Course Name: " + courseName + " Subject: " + subject+ " Students: " + students);

 }
    @Override
    public String toString() {
        return "CourseGenerics{" +
                "studentName='" + courseName + '\'' +
                ", subject=" + subject +
                ", students=" + students +
                '}';
    }


}
