import java.util.ArrayList;
import java.util.Date;

public abstract class Member {

    private String code;
    private String firstName;
    private String lastName;
    private Date registryDate;
    private Membership membershipType;

    public Member (String firstName, String lastName, Membership membershipType) {
        setCode();
        setFirstName(firstName);
        setLastName(lastName);
        setRegistryDate();
        setMembershipType(membershipType);
    }

    public String getCode() {
        return this.code;
    }

    abstract public void setCode();

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getRegistryDate() {
        return this.registryDate;
    }

    public void setRegistryDate() {
        this.registryDate = new Date();
    }

    public Membership getMembershipType() {
        return this.membershipType;
    }

    public void setMembershipType(Membership membershipType) {
        this.membershipType = membershipType;
    }

}