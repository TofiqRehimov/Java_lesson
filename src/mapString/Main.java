package mapString;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> mylist =  Arrays.asList("Tofiq","Huseyn","Ismayil","Musa","Elnur","HuseynR","Ilkin","Emin","Aytac");



//        System.out.println(mylist);

      mylist.stream().map(l -> Arrays.stream(l.split("")).toList()).forEach(System.out::println);
      ;

    }
}
