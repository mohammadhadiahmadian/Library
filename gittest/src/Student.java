import java.util.Date;

public class Student extends Member {

    private static int studentNumber = 0;
    private String code;
    private Membership membershipType = Membership.STUDENT;

    public Student(String name, String familyName, Membership membershipType) {
        super(name, familyName, membershipType);
    }

    public void setCode() {
        studentNumber++;
        this.code = "S".concat(Integer.toString(studentNumber));
    }
}
