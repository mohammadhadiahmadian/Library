import java.util.Date;

public abstract class Source {

    private static int sourceNumber = 0;
    private String code;
    private String title;
    private boolean borrowable = true;
    private Date returnTimeout;

    public Source(String title) {
        setCode();
        setTitle(title);
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

    public boolean isBorrowable() {
        return this.borrowable;
    }

    public void setBorrowable(boolean borrowable) {
        this.borrowable = borrowable;
    }

    public Date getReturnTimeout() {
        return this.returnTimeout;
    }

    abstract Date setReturnTimeout(Member member) throws GuestBorrowException;

}