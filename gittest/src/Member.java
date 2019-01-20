import java.util.Date;

public abstract class Member {

    private String name;
    private String familyName;
    private Date registeryDate;
    private Membership membershipType;

    public Member (String name, String familyName, Date registeryDate, Membership membershipType) {
        setCode();
        setName(name);
        setFamilyName(familyName);
        setRegisteryDate(registeryDate);
        setMembershipType(membershipType);
    }

    abstract public void setCode();

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamilyName() {
        return this.familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public Date getRegisteryDate() {
        return this.registeryDate;
    }

    public void setRegisteryDate(Date registeryDate) {
        this.registeryDate = registeryDate;
    }

    public Membership getMembershipType() {
        return this.membershipType;
    }

    public void setMembershipType(Membership membershipType) {
        this.membershipType = membershipType;
    }

}