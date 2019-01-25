public enum Membership {
    TEACHER("Teacher"),
    STUDENT("Student"),
    GUEST("Guest");

    private final String string;

    Membership(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return this.string;
    }
}