import java.util.Date;

public class Magazine extends Source {

    private int magazineNumber;
    private Date publishDate;

    public Magazine(String title, int magazineNumber, Date publishDate) {
        super(title);
        setMagazineNumber(magazineNumber);
        setPublishDate(publishDate);
    }

    public int getMagazineNumber() {
        return this.magazineNumber;
    }

    public void setMagazineNumber(int magazineNumber) {
        if (magazineNumber > 0)
            this.magazineNumber = magazineNumber;
        else
            this.magazineNumber = 1;
    }

    public Date getPublishDate() {
        return this.publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public Date setReturnTimeout(Member member) throws GuestBorrowException{
        Date result = new Date();
        if (member instanceof Student)
            new Date().setHours(new Date().getHours() + 240);
        else if (member instanceof Teacher)
            result.setHours(result.getHours() + 480);
        else
            throw new GuestBorrowException(member);
        return result;
    }

}