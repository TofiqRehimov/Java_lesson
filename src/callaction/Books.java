package callaction;

public class Books {
    private String bookName;
    private String author;
    private boolean available;

    public Books(String bookName, String author) {
        this.bookName = bookName;
        this.author = author;
        this.available = true;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {

        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }


    @Override
    public String toString() {
        return " Books{ " +
                "bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", available=" + (available ? " Movcuddur": "Icarededir") +
                '}';
    }

    public void rent (){
        if(available){
            available = false;
            System.out.println( bookName + " icareye verildi");
        }
        else{
            System.out.println(" "+ bookName + " icarededir");
        }

    }
    public void returnBook (){
        if(!available){
            available = true;
            System.out.println(" "+ bookName + "  kitab geri qaytarildi");
        }
        else{
            System.out.println(" "+ bookName + "  kitab qaytarilmadi");
        }

}
}


