public class Teacher extends Member {

    private static int teacherNumber = 0;
    private String code;

    public Teacher(String name, String familyName) {
        super(name, familyName, Membership.TEACHER);
    }

    public void setCode() {
        teacherNumber++;
        this.code = "L".concat(Integer.toString(teacherNumber));
    }
}
