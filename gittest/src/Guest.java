public class Guest extends Member {

    private static int guestNumber;
    private String code;

    public Guest(String name, String familyName) {
        super(name, familyName, Membership.GUEST);
    }

    public void setCode() {
        guestNumber++;
        this.code = "G".concat(Integer.toString(guestNumber));
    }
}