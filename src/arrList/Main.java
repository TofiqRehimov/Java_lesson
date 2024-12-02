package arrList;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Tofiq");
        list.add("Ramazan");
        list.add("Ayan");

        list.add(0, "Konul");

//        System.out.println(list.get(0));
//        System.out.println(list);

        LinkedList<String> set = new LinkedList<>();
        set.add("Semed");
        set.add("Ismayil");
        set.add("Musa");
        set.add("Huseyn");
        set.add("Emin");

        String sList  = set.get(0);
        for(String s : set) {
        if(sList.length() <0) {
            System.out.println(s);
        }
//            System.out.println(s);


        }
    }
}
