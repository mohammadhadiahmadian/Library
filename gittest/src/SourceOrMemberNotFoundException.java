public class SourceOrMemberNotFoundException extends Exception {
    public SourceOrMemberNotFoundException() {

    }

    @Override
    public String getMessage() {
        return "You have entered a wrong code for source or member.";
    }
}
