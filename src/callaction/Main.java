package callaction;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> mapList = new HashMap<>();
        mapList.put(10, "Baku");
        mapList.put(41, "Lacin");
        mapList.put(59, "Terter");
        mapList.put(50, "Sumqayit");
        mapList.put(55, "Seki");

//        for (String e : mapList.values())
////            System.out.println(e);
//        for (Integer key : mapList.keySet())
//            System.out.println(key);


//        System.out.println(mapList.containsKey(10));
//        System.out.println(mapList.containsValue("Baku"));


        Books book1 = new Books("Java Programming", "James Gosling");
        Books book2 = new Books("Clean Code", "Robert C. Martin");
        Books book3 = new Books("The Pragmatic Programme", "Andrew Hunt'");

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.showAvailableBooks();
        library.rentBook("Clean Code");
        library.showAllBooks();
        library.showAvailableBooks();
        library.returnBook("Clean Code");
        library.showAllBooks();
    }
}
