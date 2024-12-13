package funtionInterface;

public class Main {
    public static void main(String[] args) {

        // Calculator sum =(a,b) ->a +b;
//        Calculator sum = Integer::sum; //lamda expression
//        Calculator d = (a,b) -> a-b;
//        Calculator v= (a,b)-> a*b;
//        Calculator bb = (a,b) -> a/b;
//
//        System.out.println(sum.operation(5,5));
//        System.out.println(d.operation(5,4));
//        System.out.println(v.operation(5,5));
//        System.out.println(bb.operation(6,2));

        Bifunctions bool = (a,b) -> a==b;
        System.out.println(bool.BiF(5,7));

        Consumers <String> cons =  t -> System.out.println(t);
        cons.consume("Void");

        Predicetes  predice = a -> a >3;
        System.out.println(predice.pre(5));

  Functions <Integer,Integer> func = x->x*2;
        System.out.println(func.funtions(2));

    }
}
