import java.util.ArrayList;
import java.util.Date;

public class Main {

    private ArrayList<Member> members = new ArrayList<>();
    private ArrayList<Source> sources = new ArrayList<>();

    public static void main(String[] args) {

    }

    public ArrayList<Member> getMembers() {
        return this.members;
    }

    public void addMember(Member member) {
        this.members.add(member);
    }

    public ArrayList<Source> getSources() {
        return this.sources;
    }

    public void addSource(Source source) {
        this.sources.add(source);
    }

    public ArrayList<Source> searchSource(String search) {
        ArrayList<Source> result = new ArrayList<>();
        for (Source source : this.getSources()) {
            if (source.getTitle().contains(search))
                result.add(source);
        }
        return result;
    }

    public ArrayList<Member> searchMember(String search) {
        ArrayList<Member> result = new ArrayList<>();
        for (Member member : this.getMembers()) {
            if (member.getFirstName().contains(search) || member.getLastName().contains(search))
                result.add(member);
        }
        return result;
    }

    public ArrayList<Member> timeoutInfringements() {
        ArrayList<Member> result = new ArrayList<>();
        for (Member member : this.getMembers()) {
            for (Source source : member.getBorrows()) {
                if (source.getReturnTimeout().before(new Date())) {
                    result.add(member);
                    break;
                }
            }
        }
        return result;
    }

}
