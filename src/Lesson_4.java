import java.util.Arrays;
public class Lesson_4 {
    public static void main(String[] args) {
//        int a = 3;
//       int b = 5;
//       a = a +2;
//       b = b-2;
//       System.out.println(a + " " + b);

//        System.out.println("Eded daxil edin");
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        boolean num1 = ( num % 2 ==0);
//        System.out.println("Cut eded " + num1);

//        int a= 1;
//        while (a <= 10){
//            if(a %2 ==0){
//                System.out.println(a);
//            }
//            a++;
//
//        }
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//
//        for (int a = 1; a <= 10; a++ ){
//           System.out.println(n+ " * " + a + " = "+ + a*n);
//        }
//
//        for (int a=1; a<=10; a ++) {
//            for (int b=1; b<=10; b++) {
//                System.out.println(a+ " * " + b + " = "+ + a*b);
//            }
//        }
//
//for (int a=1; a<=10; a++) {
//    for (int b=10; b>=1; b--) {
//        System.out.println(a+ "." + b);
//    }
//}
        int[] box = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(box));
        System.out.println(box.length);
      for (var i =0; i<=box.length-1; i++ ) {
    System.out.println(box[i]);
}
        for (var i = box.length - 1; i >= 0; i--) {
            System.out.println(box[i]);
        }

    }
}
