import java.util.ArrayList;

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

}
