package Arr_OOP;

public class Student extends Academy{
    static int Student_id;
    String Student_course;

    public Student(String name, String address, int student_id, String sdudent_course) {
        super(name, address);
        Student_id = student_id;
        Student_course = sdudent_course;
    }

    public int getStudent_id() {
        return Student_id;
    }

    public String getStudent_course() {
        return Student_course;
    }

    public void setStudent_id(int student_id) {
        Student_id = student_id;
    }

    public void setStudent_course(String student_course) {
        Student_course = student_course;
    }
    void Study(){
       System.out.println("Id si "+Student_id +" olan telebe "+ name +" "+ Student_course + " cursunda tehsil alir" );

    }
}
