public class GuestBorrowException extends Exception {

    public GuestBorrowException(Member guest) {
        this.getMessage(guest);
    }

    public String getMessage(Member guest) {
        return guest.getFirstName() + guest.getLastName() + "is a guest and can't borrow magazine or thesis.";
    }

}
