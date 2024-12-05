package news;

public class Author <N> {
    private N authorName;
    private N authorSurname;

    public Author(N authorName, N authorSurname) {
        this.authorName = authorName;
        this.authorSurname = authorSurname;
    }

    public N getAuthorName() {
        return authorName;
    }

    public void setAuthorName(N authorName) {
        this.authorName = authorName;
    }

    public N getAuthorSurname() {
        return authorSurname;
    }

    public void setAuthorSurname(N authorSurname) {
        this.authorSurname = authorSurname;
    }
}
