package news;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class News <T,C extends Category,A extends Author>{
    private T newsName;
    private C newsCategory;
    private A newsAuthor;
    private LocalDate  newsDate;

    public News(T newsName, C newsCategory, A newsAuthor, LocalDate newsDate) {
        this.newsName = newsName;
        this.newsCategory = newsCategory;
        this.newsAuthor = newsAuthor;
        this.newsDate = newsDate;
    }

    public T getNewsName() {
        return newsName;
    }

    public C getNewsCategory() {
        return newsCategory;
    }

    public A getNewsAuthor() {
        return newsAuthor;
    }
    public String getNewsDate() {
        return newsDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }



    public void displayInfo(){
        System.out.println(" Yeni xeber " + newsName );
        System.out.println(" Proqraming " +newsCategory.getName());
        System.out.println(" Ramazan " +newsAuthor.getAuthorName());
        System.out.println("Date " + getNewsDate());
    }
}
