import java.util.Date;

public class Magazine extends Source {

    private int magazineNumber;

    public Magazine(String title, Date publishDate, int magazineNumber) {
        super(title, publishDate);
        setMagazineNumber(magazineNumber);
    }

    public void setMagazineNumber(int magazineNumber) {
        if (magazineNumber > 0)
            this.magazineNumber = magazineNumber;
        else
            this.magazineNumber = 1;
    }

    public int getMagazineNumber() {
        return magazineNumber;
    }

}
