package studentsRegistration;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Ad daxil edin: ");
        Scanner sc = new Scanner(System.in);
        var studentsName = sc.nextLine();
        System.out.println("Dogum tarixi daxil et : ");

        var dateOfBirth = sc.nextLine();

        ArrayList<String> students = new ArrayList<>();
        students.add(studentsName);
        students.add(dateOfBirth);
        ArrayList studendsClone = (ArrayList) students.clone();
        DateTimeFormatter newDate = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        var formattedDate = LocalDate.now().format(newDate);


//        int b = formattedDate.compareTo(dateOfBirth);

        System.out.println("Clone: "+ studendsClone);
        System.out.println("Clone: "+ studendsClone.get(1));
        System.out.println("Date: "+ formattedDate);

        for ( int i =0; i <= formattedDate.length(); i++ ) {
            System.out.print(i);
        }
    }
}
