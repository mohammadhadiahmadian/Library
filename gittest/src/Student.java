public class Student extends Member {

    private static int studentNumber = 0;
    private String code;

    public Student(String name, String familyName) {
        super(name, familyName, Membership.STUDENT);
    }

    public void setCode() {
        studentNumber++;
        this.code = "S".concat(Integer.toString(studentNumber));
    }
}
