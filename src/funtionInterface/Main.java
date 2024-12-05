package funtionInterface;

public class Main {
    public static void main(String[] args) {

        // Calculator sum =(a,b) ->a +b;
        Calculator sum = Integer::sum; //lamda expression
        Calculator d = (a,b) -> a-b;
        Calculator v= (a,b)-> a*b;
        Calculator bb = (a,b) -> a/b;

        System.out.println(sum.operation(5,5));
        System.out.println(d.operation(5,4));
        System.out.println(v.operation(5,5));
        System.out.println(bb.operation(6,2));

    }
}
