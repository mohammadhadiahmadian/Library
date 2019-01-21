public class Guest extends Member {

    private static int guestNumber;
    private String code;

    public Guest(String firstName, String lastName) {
        super(firstName, lastName, Membership.GUEST);
    }

    public void setCode() {
        guestNumber++;
        this.code = "G".concat(Integer.toString(guestNumber));
    }
}