package mapString;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> mylist =  Arrays.asList("Tofiq","Huseyn","Ismayil","Musa","Elnur","HuseynR","Ilkin","Emin","Aytac");



//        System.out.println(mylist);

      mylist.stream().map(l -> {
          return Arrays.stream(l.split("")).toList();
      }).forEach(System.out::println);


      var mylist2 = mylist;
      mylist2.stream().flatMap(f -> Arrays.stream(f.split(""))).forEach(System.out::println);

    }
}
