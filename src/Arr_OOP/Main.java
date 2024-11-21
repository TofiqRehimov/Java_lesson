package Arr_OOP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//            int [] arr = new int[10];
//            int [] arr2 = new int[30];
//
//            for (int i = 0; i < arr2.length; i++) {
//                arr2[i] = arr.length;
//                System.out.println(arr2.length);
//            }


        ///  Arrayin indexin dinamik artirib azaltma


//        Scanner sc= new Scanner(System.in);
//        System.out.print("Birinci array uzunlugu: ");
//        int size=sc.nextInt();
//        int[] arr=new int[size];
//        for(int i = 0; i < size; i++) {
//            arr[i] = sc.nextInt();
//
//        }
//        System.out.print("Ikinci array uzunlugu: ");
//        int size2 = sc.nextInt();
//        int[] arr2 = new int[size2];
//        if(size2 > size) {
//            for(int i = 0; i < size; i++) {
//                arr2[i] = arr[i];
//                System.out.println(arr2[i] + " ");
//            }
//            System.out.print("Yeni elementleri daxil edin: ");
//// example: i = 5-3+1; i < 5; i++
//            for(int i = (size2 - size) + 1; i < size2; i++) {
//                arr2[i] = sc.nextInt();
//            }
//        }
//        else {
//            for(int i = 0; i < size2; i++) {
//                arr2[i] = arr[i];
//            }
//        }
//
//        for(int i = 0; i < size2; i++) {
//            System.out.print(arr2[i] + " ");
//        }

//        Academy academy = new Academy();

        Student s1 = new Student("Tofiq","Baku",1,"ATL");
//
        s1.Study();
        Teacher t1 = new Teacher("Musviq", "BB",2, "Java");
        t1.teach();
    }
}
