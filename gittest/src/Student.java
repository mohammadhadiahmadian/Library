import java.util.Date;

public class Student extends Member {

    private static int studentNumber;
    private String code;
    private membership membershipType = membership.STUDENT;

    public Student(String name, String familyName, Date registeryDate, membership membershipType) {
        super(name, familyName, registeryDate, membershipType);
    }

    public void setCode() {
        studentNumber++;
        this.code = "S".concat(Integer.toString(studentNumber));
    }
}
