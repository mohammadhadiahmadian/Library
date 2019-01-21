import java.util.ArrayList;
import java.util.Date;

public class Book extends Source {

    private ArrayList<String> author = new ArrayList();

    public Book(String title, Date publishDate, ArrayList<String> author) {
        super(title, publishDate);
        setAuthor(author);
    }

    public ArrayList<String> getAuthor() {
        return this.author;
    }

    public void setAuthor(ArrayList<String> author) {
        this.author = author;
    }

    public boolean borrowing(Member member) {
        Date date = new Date();
        if(this.isBorrowable()) {
            if (member.getMembershipType().equals(Membership.STUDENT)) {
                date.setHours(date.getHours() + 336);
            }
            else if (member.getMembershipType().equals(Membership.TEACHER)) {
                date.setHours(date.getHours() + 720);
            }
            else if (member.getMembershipType().equals(Membership.GUEST)) {
                date.setHours(date.getHours() + 240);
            }
            this.setBorrowDate();
            this.setReturnDateLimit(date);
            this.setBorrowable(false);
            return true;
        }
        else {
            return false;
        }
    }

}