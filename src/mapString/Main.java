package mapString;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> mylist = new ArrayList<>();

        mylist.add("Tofiq");
        mylist.add("Huseyn");
        mylist.add("Ismayil");
        mylist.add("Musa");
        mylist.add("Elnur");
        mylist.add("HuseynR");
        mylist.add("Ilkin");
        mylist.add("Emin");
        mylist.add("Aytac");

        HashMap<Object, Object> myMap  =new HashMap<>();
        System.out.println(mylist);
        for(String s:mylist ){
            String [] newlist=s.split("");
            myMap.put(newlist[0],newlist[1]);
            System.out.println(myMap);
        }
    }
}
