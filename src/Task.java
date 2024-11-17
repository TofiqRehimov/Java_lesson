import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {


//        for(int i=0; i<=4; i++){
//
//            System.out.println(u);
//            System.out.println(d);
//        }

//        for (int i = 1; i < 6; i++) {
//
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        for(int i=1; i< 5; i++){
//            System.out.print("* ");
//            for(int j=1; j< 5; j++){
//
//                System.out.print(" ");
//
//            }
//            System.out.println(" *");
//        }

// int a=1;
//     for (int i =1; i < 6; i++){
//         System.out.println(a);
//
//        for (int j =1; j <=i; j++){
//            System.out.print(a);
//     }
//
////     System.out.print(i-1);
//     }

//        int[] Arrays = {10, 35, 4, 28, 41};
//        int max = 0;
//        for (int i = 1; i < Arrays.length; i++) {
//            if (max < Arrays[i]) {
//                max = Arrays[i];
//            }
//        }
//        System.out.println(max);


        ///  Scanner ile 5 ededli Array elementleri


//        System.out.println("Eded daxil et: ");
//        Scanner sc = new Scanner(System.in);
//
//        int[] arr = new int[5];
//        for (int i = 0; i <= arr.length-1; i++){
//            arr[i] = sc.nextInt();
//
//        }
//        for(int i = 0; i <= arr.length-1; i++){
//            System.out.print(arr[i] + " ");
//        }

        /// Scanner ile Arrayin Min ve Max in tapmaq

//        System.out.println("Eded daxil et: ");
//        Scanner sc = new Scanner(System.in);
//
//        int [] array = new int[5];
//        int Max = 0;
//        int Min  = 999;
//
//        for(int i =0; i <= array.length-1; i++){
//             array[i] = sc.nextInt();
//        }
//         for(int i=0; i< array.length; i++){
//             if(Max < array[i]){
//                 Max = array[i];
//             }
//            else if(Min >= array[i]){
//                 Min = array[i];
//             }
//         }
//        System.out.println("Maksimum " + Max);
//        System.out.println("Minimum " + Min);

        ///  Array ile edelerin cemi ve eded ortasin tapmaq

//        System.out.println("Eded ");
//        Scanner sc = new Scanner(System.in);
//        int Sum = 0;
//        float Averge = 0;
//        int[] array = new int[5];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = sc.nextInt();
//
//            if ( 0 < array.length) {
//                Sum += array[i];
//            }
//             if( array.length > 0){
//                float Av = Sum;
//                Averge = Av / array.length;
//            };
//        }
//        System.out.println("Sum: " + Sum);
//        System.out.println("Average: " + Averge);


        /// Arrays Scanner ile daxil olan ededlerin tekrar sayini tapmaq

        System.out.println("eded: ");
        Scanner sc = new Scanner(System.in);
//        int[] arr = new int[5];
        int[] arr = {1, 2, 3, 44, 5, 6};
        int userNum = sc.nextInt();

//        for (int i = 0; i <= arr.length-1; i++){
//            arr[i] = sc.nextInt();
//        }
        int t = 0;
        int ta = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] == userNum) {
                t=i;

            } else ta =i;
        }
        System.out.print(t + " Tekrardir ");
        System.out.print(ta + " Tekrardir");
    }
}
