import java.util.Date;

public abstract class Source {

    private static int sourceNumber = 0;
    private String code;
    private String title;
    private Date publishDate;
    private Date borrowDate;
    private Date returnDate;
    private boolean borrowable = true;

    public Source(String title, Date publishDate) {
        setCode();
        setTitle(title);
        setPublishDate(publishDate);
    }

    public String getCode() {
        return this.code;
    }

    public void setCode() {
        sourceNumber++;
        this.code = "R".concat(Integer.toString(sourceNumber));
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getPublishDate() {
        return this.publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public Date getBorrowDate() {
        return this.borrowDate;
    }

    public void setBorrowDate() {
        this.borrowDate = new Date();
    }

    public Date getReturnDate() {
        return this.returnDate;
    }

    public abstract void setReturnDate(Member member);

    public boolean isBorrowable() {
        return this.borrowable;
    }

    public void setBorrowable(boolean borrowable) {
        this.borrowable = borrowable;
    }

    public abstract void borrowSource(Member member);

    public abstract void returnSource(Member member);

}