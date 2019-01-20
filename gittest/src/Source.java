import java.util.Date;

public abstract class Source {

    private static int sourceNumber = 0;
    private String code;
    private String title;
    private Date publishDate;
    private Date borrowDate;
    private Date returnDateLimit;
    private Date returnDate;
    private boolean borrowable;

    public Source(String title, Date publishDate) {
        setCode();
        setTitle(title);
        setPublishDate(publishDate);
        setBorrowable(true);
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

    /* public Date getPublishDate() {
        return this.publishDate;
    } */

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public Date getBorrowDate() {
        return this.borrowDate;
    }

    public void setBorrowDate() {
        this.borrowDate = new Date();
    }

    public Date getReturnDateLimit() {
        return this.returnDateLimit;
}

    public void setReturnDateLimit(Date returnDateLimit) {
        this.returnDateLimit = returnDateLimit;
    }

    /* public Date getReturnDate() {
        return this.returnDate;
    } */

    public void setReturnDate() {
        this.returnDate = new Date();
    }

    public boolean isBorrowable() {
        return this.borrowable;
    }

    public void setBorrowable(boolean borrowable) {
        this.borrowable = borrowable;
    }

    abstract public boolean borrowing(Member member);

}
