import java.util.Date;

public class Magazine extends Source {

    private int magazineNumber;

    public Magazine(String title, int magazineNumber) {
        super(title);
        setMagazineNumber(magazineNumber);
    }

    public void setMagazineNumber(int magazineNumber) {
        if (magazineNumber > 0)
            this.magazineNumber = magazineNumber;
        else
            this.magazineNumber = 1;
    }

    public Date setReturnTimeout(Member member) throws GuestBorrowException{
        Date result = new Date();
        if (member instanceof Student)
            result.setHours(result.getHours() + 240);
        else if (member instanceof Teacher)
            result.setHours(result.getHours() + 480);
        else  (member instanceof Guest)
            throw GuestBorrowException;
        return result;
    }

}