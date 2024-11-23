package Arr_OOP;

public class Academy {


    public String name;
    public String address;
    private Student [] students;
    private int StudentCound;

    public Academy() {

    }
    public Academy(String name, String address) {
        this.name = name;
        this.address = address;
        this.StudentCound = 0;
        this.students = new Student[1];
    }
    public void AddStudent(Student student) {
        if(StudentCound == students.length){
        Student[] newStudents = new Student [StudentCound + 5];
        System.out.println(newStudents.length);
        }

    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    static void DisplayInfo(){
        System.out.println("Academy");
    }

}
