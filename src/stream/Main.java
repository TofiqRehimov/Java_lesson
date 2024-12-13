package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {



        List <Customer> list = (List<Customer>) Arrays.asList(
        new Customer("Tofiq",350),
        new Customer("Elnur",450),
        new Customer("Kenan",600),
        new Customer("Emin",100)
);
        System.out.println(list);
       list.stream().filter(
                x->x.getDebt()>=350)
                .map((x)->{
            double i =(x.getDebt() *50/100);
            double v = x.getDebt() +i;
                    x.setDebt(v);
//                    System.out.println("Debt is "+x);
                    return i;
                }).forEach(i -> System.out.println("faiz: "+ i));
        System.out.println(list);





    }
}
