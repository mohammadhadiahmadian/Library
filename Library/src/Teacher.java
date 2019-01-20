import java.util.Date;

public class Teacher extends Member {

    private static int teacherNumber;
    private String code;
    private membership membershipType = membership.TEACHER;

    public Teacher(String name, String familyName, Date registeryDate, membership membershipType) {
        super(name, familyName, registeryDate, membershipType);
    }

    public void setCode() {
        teacherNumber++;
        this.code = "L".concat(Integer.toString(teacherNumber));
    }
}