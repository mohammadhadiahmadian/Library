import java.util.ArrayList;
import java.util.Date;

public class Book extends Source {

    private ArrayList author = new ArrayList();

    public Book(String title, Date publishDate, ArrayList author) {
        super(title, publishDate);
        setAuthor(author);
    }

    public ArrayList getAuthor() {
        return this.author;
    }

    public void setAuthor(ArrayList author) {
        this.author = author;
    }

}