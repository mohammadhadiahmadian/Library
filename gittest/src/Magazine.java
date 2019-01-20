import java.util.Date;

public class Magazine extends Source {

    private int magazineNumber;

    public Magazine(String title, Date publishDate, int magazineNumber) {
        super(title, publishDate);
        setMagazineNumber(magazineNumber);
    }

    public int getMagazineNumber() {
        return magazineNumber;
    }

    public void setMagazineNumber(int magazineNumber) {
        if (magazineNumber > 0)
            this.magazineNumber = magazineNumber;
        else
            this.magazineNumber = 1;
    }

    public boolean borrowing(Member member) {
        Date date = new Date();
        if(this.isBorrowable()) {
            if (member instanceof Student) {
                date.setHours(date.getHours() + 240);
            }
            else if (member instanceof Teacher) {
                date.setHours(date.getHours() + 480);
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