import java.util.ArrayList;
import java.util.Date;

public class Thesis extends Source {

    private ArrayList author;
    private AuthorGrade grade;

    public Thesis(String title, Date publishDate, ArrayList author, AuthorGrade grade) {
        super(title, publishDate);
        setAuthor(author);
        setGrade(grade);
    }

    public ArrayList getAuthor() {
        return this.author;
    }

    public void setAuthor(ArrayList author) {
        this.author = author;
    }

    public AuthorGrade getGrade() {
        return this.grade;
    }

    public void setGrade(AuthorGrade grade) {
        this.grade = grade;
    }

    public void borrowing(Member member) throws GuestBorrowException {
        Date date = new Date();
        if(this.isBorrowable()) {
            if (member instanceof Student) {
                date.setHours(date.getHours() + 120);
            }
            else if (member instanceof Teacher) {
                date.setHours(date.getHours() + 240);
            }
            else if (member instanceof Guest) {
                throw new GuestBorrowException();
            }
            this.setBorrowDate();
            this.setReturnDate(date);
            this.setBorrowable(false);
        }
    }

}
