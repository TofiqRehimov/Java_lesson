package news;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<News> newsList = new ArrayList<>();
        var a = new News("Tt", new Category("Pr"), new Author("R", "Rehim"),
                LocalDate.of(10, 11, 12));

        newsList.add(a);
        a.displayInfo();

    }
}

