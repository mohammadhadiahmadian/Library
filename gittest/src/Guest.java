import java.util.Date;

public class Guest extends Member {

    private static int guestNumber;
    private String code;
    private Membership membershipType = Membership.GUEST;

    public Guest(String name, String familyName, Membership membershipType) {
        super(name, familyName, membershipType);
    }

    public void setCode() {
        guestNumber++;
        this.code = "G".concat(Integer.toString(guestNumber));
    }
}