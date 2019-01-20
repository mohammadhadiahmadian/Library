import java.util.Date;

public class Thesis extends Source {

    private String author;

    authorGrade grade;

    public Thesis(String title, Date publishDate, String author, authorGrade grade) {
        super(title, publishDate);
        setAuthor(author);
        setGrade(grade);
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setGrade(authorGrade grade) {
        this.grade = grade;
    }

    public authorGrade getGrade() {
        return this.grade;
    }

}
