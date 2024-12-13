package Comparate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        var emp1 = new  Employee("Aytac", 4000,22);
        var emp2 = new  Employee("Ulker", 4001,28);
        var emp3 = new  Employee("Huseyn", 5000,26);

        var empList =  Arrays.asList(emp1, emp2, emp3);
        System.out.println(empList);
        Collections.sort(empList);
        System.out.println(empList);

        var animal1 = new Animal("monkey",90, 170);
        var animal2 = new Animal("giraffe",170, 300);
        var animal3 = new Animal("zonkey",85, 160);

        var animalList1 = Arrays.asList(animal1, animal2, animal3);
        System.out.println(animalList1);
//        Collections.sort(animalList1,new AnimalComperator());
//        System.out.println(animalList1);
    }
}
