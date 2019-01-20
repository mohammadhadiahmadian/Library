import java.util.Date;

public class Guest extends Member {

    private static int guestNumber;
    private String code;
    private membership membershipType = membership.GUEST;

    public Guest(String name, String familyName, Date registeryDate, membership membershipType) {
        super(name, familyName, registeryDate, membershipType);
    }

    public void setCode() {
        guestNumber++;
        this.code = "G".concat(Integer.toString(guestNumber));
    }
}