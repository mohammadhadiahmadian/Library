import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        ArrayList<Source> sources;
        ArrayList<Member> members;

    }

    public void borrowSource(Source source, Member member) {
        source.borrowing(member);
        member.borrowSource(source);
    }

    public void returnSource (Source source, Member member) {
        source.setReturnDate();
    }

    public ArrayList<Member> Infringements(ArrayList<Member> members) {
        ArrayList<Member> result = new ArrayList<>();
        for (Member member : members) {
            for (Source source : member.getBorrows()) {
                if (source.getReturnDateLimit().before(new Date())) {
                    result.add(member);
                    break;
                }
            }
        }
        return result;
    }

    public ArrayList<Member> searchMembers(ArrayList<Member> members, String searchPhrase) {
        ArrayList<Member> result = new ArrayList<>();
        for (Member member : members) {
            if (member.getName().contains(searchPhrase) || member.getFamilyName().contains(searchPhrase)) {
                result.add(member);
            }
        }
        return result;
    }

    public ArrayList<Source> searchSources(ArrayList<Source> sources, String searchPhrase) {
        ArrayList<Source> result = new ArrayList<>();
        for (Source source : sources) {
            if (source.getTitle().contains(searchPhrase)) {
                result.add(source);
            }
        }
        return result;
    }

}
