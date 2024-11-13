import java.util.Scanner;

public class Lesson_3 {
    public static void main(String[] args) {

        var space = " ";

//        System.out.println("Enter number: ");
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//        boolean a = (input % 3==0 || input %4==0);
//
//        System.out.println(a);

        /// If else 4 ve 6 ya bolunme

//        System.out.print("Enter namber:  ");
//        Scanner scanner = new Scanner(System.in);
//        int input = scanner.nextInt();
//        if (input % 4==0 && input % 6==0) {
//            System.out.println("Bolunur");
//        }
//        else System.out.println("Bolunmur");

//        if(input %3 ==0 || input %4 ==0 ) {
//            System.out.println("You entered valid number");
//        }
//        else System.out.println("You entered an invalid number");

        /// Bal hesablanmasi
//
//        System.out.println("Bali qeyd edin: ");
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//        if (input <= 40) {
//            System.out.println("Sizin baliniz E -dir ");
//        } else if (input <= 50) {
//            System.out.println("Sizin baliniz D -dir ");
//        } else if (input <= 70) {
//            System.out.println("Sizin baliniz C -dir ");
//        } else if (input <= 80) {
//            System.out.println("Sizin baliniz B -dir ");
//        } else if (input <= 90) {
//            System.out.println("Sizin baliniz A -dir ");
//        }
//        else{ System.out.println("Sizin baliniz F -dir "); }

        /// Fesili tapmaq

//        System.out.println("hansi ay oldugunu qeyd edin ");
//        Scanner sc = new Scanner(System.in);
//        var input = sc.next();
//         switch (input) {
//             case "Yanvar":
//                 System.out.println("Qis feslidir");
//                 break;
//             case "Fevral":
//                 System.out.println("Qis feslidir");
//                 break;
//             case "Mart":
//                 System.out.println("Qis feslidir");
//                 break;
//             case " Aprel":
//                 System.out.println("Yaz feslidir");
//                 break;
//             case "May":
//                 System.out.println("Yaz feslidir");
//                 break;
//             case " Iyun":
//                 System.out.println("Yaz feslidir");
//                break;
//             case "Iyul":
//                 System.out.println("Yay feslidir");
//                 break;
//             case "Avqust":
//                 System.out.println("Yay feslidir");
//                 break;
//             case "Sentyabr":
//                 System.out.println("Yay feslidir");
//                 break;
//             case "Oktyabr":
//                 System.out.println("Payiz feslidir");
//                 break;
//             case "Noyabr":
//                 System.out.println("Payiz feslidir");
//                 break;
//             case "Dekabr":
//                 System.out.println("Payiz feslidir");
//                 break;
//                 default:
//                     System.out.println("Duzgun qeyd etmemisiniz");
//
//         }


        ///  Fevral ayinin 29 dan olan il

//        System.out.println("Ay daxil edin: ");
//        Scanner sc = new Scanner(System.in);
//        int month = sc.nextInt();
//        if(month % 4 ==0 && month % 400 ==0){
//            System.out.println("Fevral ayi 29 -dir");
//        }
//        else{ System.out.println("Fevral ayi 29-dan deyil"); };

        /// Heftenin gunleri

//        System.out.println("Gun daxil et: ");
//        Scanner sc = new Scanner(System.in);
//        int days = sc.nextInt();
//
//        switch (days) {
//        case 1: System.out.println("Sunday"); break;
//        case 2: System.out.println("Monday"); break;
//        case 3: System.out.println("Tuesday"); break;
//        case 4: System.out.println("Wednesday"); break;
//        case 5: System.out.println("Thursday"); break;
//        case 6: System.out.println("Friday"); break;
//        case 7: System.out.println("Saturday"); break;
//        }

        /// Pozitiv ve neqativ reqemler

//        System.out.println("Reqem yaz");
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        if(num > 0){
//            System.out.println("Musbet eded");
//        }
//        else if(num ==0 ){
//            System.out.println("Eded 0-dir");
//        }
//        else
//        {
//            System.out.println("Eded menfi ededdir");
//        };

        /// Endirim faizi

        System.out.println("Mebleg daxil edin: ");
        Scanner sc = new Scanner(System.in);
        float input = sc.nextFloat();
        if( input>= 10 && input<=100) {
            float num = (input /100) *7;
            float num2 = input - num;
            System.out.println("Satis meblegi: "+
                    space + input +space + "Endirim  7 %  = " +
                    num + "azn" +space + "Yekun mebleg: "+ num2+ space +"azn");

        }
        else if(input > 100 && input<=200) {
            float num = (input /100) *15;
            float num2 = input - num;
            System.out.println("Satis meblegi: "+
                    space + input +space + "Endirim  15 %  = " +
                    num + "azn" +space + "Yekun mebleg: "+ num2+ space +"azn");
        }
        else if(input > 200 ) {
            float num = (input /100) *22;
            float num2 = input - num;
            System.out.println("Satis meblegi: "+
                    space + input +space + "Endirim  22 %  = " +
                    num + "azn" +space + "Yekun mebleg: "+ num2+ space +"azn");
        }
        else {
            System.out.println("Size endirim dusmur");
        }
    }
}
