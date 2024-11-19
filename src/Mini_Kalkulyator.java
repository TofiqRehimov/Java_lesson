import java.util.Scanner;

public class Mini_Kalkulyator {

    public static void main(String[] args) {
        System.out.println("Eded 1: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.print("operator elave et: ");
        String op=sc.next();
        System.out.print("Eded 2: ");
        int number2 = sc.nextInt();

        var p = new Plus();
        var m = new Cixmaq();
        var b = new Bolme();
        var v = new Vurma();


            if (op.equals("+")){
                var PP = p.Plus(number,op,number2);
                System.out.print("Netice "+PP);
            }
            else if (op.equals("-")){
                var C = m.Cixmaq(number,op,number2);
                System.out.print("Netice "+C);
            }
            else if(op.equals("/")){
                var B = b.Bolme(number,op,number2);
                System.out.print("Netice "+B);


            }
            else if(op.equals("*")){
                var V = v.Vurma(number,op,number2);
                System.out.print("Netice "+V);
            }



//        System.out.println(p.Plus(1,"+",2));





    }

}
