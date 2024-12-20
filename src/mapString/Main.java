package mapString;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {

        List<String> mylist = Arrays.asList("Tofiq", "Huseyn", "Ismayil", "Musa", "Elnur", "HuseynR", "Ilkin", "Emin", "Aytac");


//        System.out.println(mylist);

//      mylist.stream().map(l -> {
//          return Arrays.stream(l.split("")).toList();
//      }).forEach(System.out::println);
//
//
//      var mylist2 = mylist;
//      mylist2.stream().flatMap(f -> Arrays.stream(f.split(""))).forEach(System.out::println);


        var newFile = new FileWriter("C:\\Users\\Acer\\IdeaProjects\\Java_lesson\\reSaerch\\newFile.txt");
        newFile.write("Tofiq Rehimov");
        newFile.close();
        var newFile2 = new FileReader("C:\\Users\\Acer\\IdeaProjects\\Java_lesson\\reSaerch\\newFile.txt");


    }
    }


