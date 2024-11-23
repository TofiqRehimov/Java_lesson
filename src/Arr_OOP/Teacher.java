package Arr_OOP;

public class Teacher extends Academy {
        int Teacher_id;
        String Subject;

     public Teacher(){

     }
    public Teacher(String name, String address, int teacher_id, String subject) {
        super(name, address);
        Teacher_id = teacher_id;
        Subject = subject;
    }

    public int getTeacher_id() {
        return Teacher_id;
    }

    public String getSubject() {
        return Subject;
    }

    public void setTeacher_id(int teacher_id) {
        Teacher_id = teacher_id;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }

    void teach() {
         System.out.println("Id si " + Teacher_id + "  olan  "+ name +" muellim " + Subject + "  proqran dilini kecir ");
    }
}

