public class GuestBorrowException extends Exception {

    public GuestBorrowException() {

    }

    @Override
    public String getMessage() {
        return "No guest cannot borrow magazine or thesis.";
    }

}
