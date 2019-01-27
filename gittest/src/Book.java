import java.util.ArrayList;
import java.util.Date;

public class Book extends Source {

    private int publishYear;
    private ArrayList<String> authors;

    public Book(String title, int publishYear, ArrayList<String> authors) {
        super(title);
        setPublishYear(publishYear);
        setAuthor(authors);
    }

    public int getPublishYear() {
        return this.publishYear;
    }

    public void setPublishYear(int publishYear) {
        if (publishYear >= 1300 && publishYear <= 1397)
            this.publishYear = publishYear;
        else
            this.publishYear = 1397;
    }

    public ArrayList<String> getAuthor() {
        return this.authors;
    }

    public void setAuthor(ArrayList<String> authors) {
        this.authors = authors;
    }

    public Date setReturnTimeout(Member member) {
        Date result = new Date();
        if (member instanceof Student)
            result.setHours(result.getHours() + 336);
        else if (member instanceof Teacher)
            result.setHours(result.getHours() + 720);
        else
            result.setHours(result.getHours() + 240);
        return result;
    }

}