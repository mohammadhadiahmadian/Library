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

    public boolean borrowing(Member member) {
        Date date = new Date();
        if(this.isBorrowable()) {
            if (member instanceof Student) {
                date.setHours(date.getHours() + 336);
            }
            else if (member instanceof Teacher) {
                date.setHours(date.getHours() + 720);
            }
            else if (member instanceof Guest) {
                date.setHours(date.getHours() + 240);
            }
            this.setBorrowDate();
            this.setReturnDate(date);
            this.setBorrowable(false);
            return true;
        }
        else {
            return false;
        }
    }

}