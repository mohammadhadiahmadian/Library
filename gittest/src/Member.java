import java.util.ArrayList;
import java.util.Date;

public abstract class Member {

    private String name;
    private String familyName;
    private Date registryDate;
    private Membership membershipType;
    private ArrayList<Source> borrows;

    public Member (String name, String familyName, Membership membershipType) {
        setCode();
        setName(name);
        setFamilyName(familyName);
        setRegistryDate();
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

    /* public Date getRegistryDate() {
        return this.registryDate;
    } */

    public void setRegistryDate() {
        this.registryDate = new Date();
    }

    public Membership getMembershipType() {
        return this.membershipType;
    }

    public void setMembershipType(Membership membershipType) {
        this.membershipType = membershipType;
    }

    public ArrayList getBorrows() {
        return this.borrows;
    }

    public void setBorrows(Source source) {
        if (source.borrowing(this) == true) {
            borrows.add(source);
        }
    }

    public void returnSource(Source source) {
        source.setBorrowable(true);
        source.setReturnDate();
    }

}