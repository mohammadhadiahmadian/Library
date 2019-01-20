import java.util.Date;

public class Teacher extends Member {

    private static int teacherNumber = 0;
    private String code;
    private Membership membershipType = Membership.TEACHER;

    public Teacher(String name, String familyName, Membership membershipType) {
        super(name, familyName, membershipType);
    }

    public void setCode() {
        teacherNumber++;
        this.code = "L".concat(Integer.toString(teacherNumber));
    }
}
