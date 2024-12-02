package callaction;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Books> listBook = new ArrayList<>();


    public void addBook(Books book) {
        listBook.add(book);
        System.out.println(book.getBookName() + " Kitab elave olundu");
    }

    public void rentBook(String bookName) {
        for (Books book : listBook) {
            if (book.getBookName().equals(bookName)) {
                book.rent();
//                System.out.println(book.getBookName() + " Kitab icareye verildi");
                return;
            }

        }
    }

    public void returnBook(String bookName) {
        for (Books book : listBook) {
            if (book.getBookName().equals(bookName)) {
              book.returnBook();
                return;
            }

        }
    }

    public void showAvailableBooks() {
        for (Books book : listBook) {
            if(book.isAvailable()) {
                System.out.println("Movcud olan kitablar:  " + book );
            }

        }
    }
    public void showAllBooks() {
        System.out.println(" Butun kitablar");
        for (Books b : listBook) {
            if(b.isAvailable() || !b.isAvailable()) {
                System.out.println( b);
            }
        }
    }
}