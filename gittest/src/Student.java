public class Student extends Member {

    private static int studentNumber = 0;
    private String code;

    public Student(String firstName, String lastName) {
        super(firstName, lastName, Membership.STUDENT);
    }

    public void setCode() {
        studentNumber++;
        this.code = "S".concat(Integer.toString(studentNumber));
    }
}