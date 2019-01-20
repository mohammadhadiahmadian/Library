import java.util.Date;

public class Book extends Source {

    private String[] author;

    public Book(String title, Date publishDate, String[] author) {
        super(title, publishDate);
        setAuthor(author);
    }

    public void setAuthor(String[] author) {
        this.author = author;
    }

    public String[] getAuthor() {
        return this.author;
    }

}