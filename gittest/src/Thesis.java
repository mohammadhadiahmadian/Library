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

}
