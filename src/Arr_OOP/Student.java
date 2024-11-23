package Arr_OOP;

public class Student extends Academy{
    static int Student_id;
    String StudentCourse;
    private  String studentName;


    public Student() {

    }
    public Student(String name, String address, int student_id, String studentCourse) {
        super(name, address);
        Student_id = student_id;
        StudentCourse = studentCourse;
        studentName = name;

    }
    public String getstudentName() {
        return studentName;
    }

    public void setstudentName(String student_name) {
        studentName = student_name;
    }

    public int getStudent_id() {
        return Student_id;
    }

    public String getStudentCourse() {
        return StudentCourse;
    }

    public void setStudent_id(int student_id) {
        Student_id = student_id;
    }

    public void setStudent_course(String studentCourse) {
        StudentCourse = studentCourse;
    }
    void Study(){
       System.out.println(" ID -si " +Student_id +" olan telebe "+studentName+ " " + StudentCourse + " cursunda tehsil alir" );

    }
}
