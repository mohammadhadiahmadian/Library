import java.util.Date;

public class Thesis extends Source {

    private Date publishDate;
    private String author;
    private AuthorGrade authorGrade;

    public Thesis(String title, Date publishDate, String author, AuthorGrade authorGrade) {
        super(title);
        setPublishDate(publishDate);
        setAuthor(author);
        setAuthorGrade(authorGrade);
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAuthorGrade(AuthorGrade authorGrade) {
        this.authorGrade = authorGrade;
    }

    public Date setReturnTimeout(Member member) throws GuestBorrowException{
        Date result = new Date();
        if (member instanceof Student)
            result.setHours(result.getHours() + 120);
        else if (member instanceof Teacher)
            result.setHours(result.getHours() + 240);
        else
            throw new GuestBorrowException(member);
        return result;
    }

}