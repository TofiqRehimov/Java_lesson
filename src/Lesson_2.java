import java.util.Scanner;

public class Lesson_2 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter number: ");
//        var input1 = scanner.nextInt();
//        System.out.println("Enter number2: ");
//        var input2 = scanner.nextInt();
//
//        var cem = input1 / input2;
//        var qaliq = input1 % input2;
//        System.out.println("Tam eded " +" "+cem);
//        System.out.println("qaliq eded " + " "+qaliq);

//        System.out.println("Eded daxil edin");
//        var input = new Scanner(System.in).nextInt();
//
//        int a = input/10;
//        int b = input%10;
//
//        System.out.println("onluq"+ " "+ a+ " "+ "teklik"+ " " +b);
//        System.out.println(a+ b);
//        System.out.println(a* b);

        ///  Relation Operators (Muqaise Operatorlari)

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter number: ");
//        var num = scanner.nextInt();
//        System.out.print("Enter number two: ");
//        var num2 = scanner.nextInt();
//        System.out.print("==  ");
//        System.out.println( num==num2);
//        System.out.print("!= ");
//        System.out.println(num!=num2);
//        System.out.print("<= ");
//        System.out.println(num<=num2);
//        System.out.print(">= ");
//        System.out.println(num>=num2);
//        System.out.print("> ");
//        System.out.println(num>num2);
//        System.out.print("< ");
//        System.out.println(num<num2);


        ///   3 Reqemli dedin mertebe vahidleri
//        System.out.println("Enter number: ");
//        Scanner sc = new Scanner(System.in);
//        int scannerNumber = sc.nextInt();
//        int test = scannerNumber /100;
//        int test2 = scannerNumber /10 % 10;
//        int test3 = scannerNumber %10;
//        System.out.println(test + " "+ test2 +" " + test3 );
//        System.out.println(test + test2 + test3);
//        System.out.println(test - test2 - test3);
//        System.out.println(test * test2 * test3);


        /// Beraberlik tapmaq
//        System.out.println("Enter number: ");
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int a = num / 100;
//        int b = num / 10 % 10;
//        int c = num % 10;
//        int d = c*100 +  b*10 + a;

//        System.out.println(c + "" + b + "" + a);

//        System.out.println(d);

//System.out.println("Enter number: ");
//Scanner sc = new Scanner(System.in);
//int num = sc.nextInt();
//int a = num/1000;
//int b = num/100%10;
//int c = num/10%10;
//int d = num%10;
//
//int cem = (a*b) -(c+d);
//System.out.println(cem);

//        System.out.println("Enter number: ");
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int a = num / 1000;
//        int b = num / 100 % 10;
//        int c = num / 10 % 10;
//        int d = num % 10;
//        int e = (d * 1000 + b * 100 + c * 10 + a) + 10;
//        System.out.println(e);

//        System.out.println("Enter number: ");
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        boolean a = ((num % 5) == 0);
//        System.out.println(a);

//        System.out.println("Enter number: ");
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        boolean a = ((num % 2) == 0);
//        System.out.println(a==true ? "True" : "false");


//        System.out.println("Enter number: ");
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int a = num / 100;
//        int b = num % 10;
//        boolean e = (a==b);
//        System.out.println(e == true  ? "True ": "False ");

        /// Artan siralama
//        System.out.println("Enter namber: ");
//        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
//        int num1 = number / 1000;
//        int num2 = number / 100 % 10;
//        int num3 = number / 10 % 10;
//        int num4 = number % 10;
//        boolean numbers = num1 < num2 && num3< num4 == true;
//        System.out.println(numbers);

        /// 4 reqemli ededin tek ve cut olmasi

//        System.out.println("Enter numbers: ");
//        Scanner sc = new Scanner(System.in);
//        int fourNambers = sc.nextInt();
//        int numOne = fourNambers / 1000;
//        int numTwo = fourNambers / 100 % 10;
//        int numThree = fourNambers / 10 % 10;
//        int numFour = fourNambers % 10;
//        boolean pair = (numOne %2 ==0 && numTwo %2==0 && numThree %2==0 &&  numFour %2==0) ==true;
//
//        System.out.println(pair);


        /// Ededlerin simmetrik olmasi

//        System.out.println("Enter numbers: ");
//        Scanner sc = new Scanner(System.in);
//        int symmetricalNambers = sc.nextInt();
//        int numOne = symmetricalNambers / 1000;
//        int numTwo = symmetricalNambers / 100 % 10;
//        int numThree = symmetricalNambers / 10 % 10;
//        int numFour = symmetricalNambers % 10;
//        boolean symmetrical = (numOne  == numFour && numTwo ==numThree) ==true;
//
//        System.out.println(symmetrical);


        /// Ededin 3 reqemli olmasi

        System.out.println("Enter number: ");
        Scanner src = new Scanner(System.in);
        int num = src.nextInt();
        int num1 = num;
        int num2 = num;
        int num3 = num;
        boolean numbs = num1 +num2 + num3 == 1 || num1 +num2 + num3 == -1 && num1 +num2 + num3 == 999 || num1 +num2 + num3 == -999 ==true ;
        System.out.println(numbs);
    }
}
