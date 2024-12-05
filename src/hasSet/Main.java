package hasSet;

import java.util.HashSet;

public class Main {
    public static void main( String[] args){
        Students students = new Students("Tofiq",1);
        Students students2 = new Students("Xan",2);
        HashSet <Object> Student = new HashSet<>();
        Student.add(students);



        System.out.println();
        System.out.println(Student);
    }
}
