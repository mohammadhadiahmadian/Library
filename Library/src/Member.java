import java.util.Date;

public abstract class Member {

    private String name;
    private String familyName;
    private Date registeryDate;

    public enum membership {
        STUDENT,
        TEACHER,
        GUEST
    }

    private membership membershipType;

    public Member (String name, String familyName, Date registeryDate, membership membershipType) {
        setCode();
        setName(name);
        setFamilyName(familyName);
        setRegisteryDate(registeryDate);
        setMembershipType(membershipType);
    }

    abstract public void setCode();

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getFamilyName() {
        return this.familyName;
    }

    public void setRegisteryDate(Date registeryDate) {
        this.registeryDate = registeryDate;
    }

    public Date getRegisteryDate() {
        return this.registeryDate;
    }

    public void setMembershipType(membership membershipType) {
        this.membershipType = membershipType;
    }

    public membership getMembershipType() {
        return this.membershipType;
    }
}