public class Teacher extends Member {

    private static int teacherNumber = 0;
    private String code;

    public Teacher(String firstName, String lastName) {
        super(firstName, lastName, Membership.TEACHER);
    }

    public void setCode() {
        teacherNumber++;
        this.code = "L".concat(Integer.toString(teacherNumber));
    }
}
