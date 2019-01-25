import com.sun.org.apache.bcel.internal.generic.NEW;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

    }

    public void addSource(File file) {
        try {
            DataOutputStream BookoutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("books.bin")));
            DataOutputStream MagazineoutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("magazines.bin")));
            DataOutputStream ThesisoutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("theses.bin")));
            try {
                BufferedReader reader = new BufferedReader(new FileReader(file));
                try {
                    String line = reader.readLine();
                    while (line != null) {
                        String[] items = line.split(",");
                        String title = items[1];

                        if (items[0] == "Book") {
                            int publishYear = Integer.parseInt(items[2]);
                            String authors = items[3];
                            Book book = new Book(title, publishYear, authors);
                        }

                        else if (items[0] == "Magazine") {
                            String[] date = items[2].split("/");
                            int[] dateToInteger = new int[3];
                            for (int i = 0 ; i <= 2 ; i++) {
                                dateToInteger[i] = Integer.parseInt(date[i]);
                            }
                            Date publishDate = new Date(dateToInteger[0],dateToInteger[1],dateToInteger[2]);
                            int magazineNumber = Integer.parseInt(items[3]);
                        }

                        else {
                            String[] date = items[2].split("/");
                            int[] dateToInteger = new int[3];
                            for (int i = 0 ; i <= 2 ; i++) {
                                dateToInteger[i] = Integer.parseInt(date[i]);
                            }
                            Date publishDate = new Date(dateToInteger[0],dateToInteger[1],dateToInteger[2]);
                            String author = items[3];
                            String authorGrade = items[4];
                        }

                        line = reader.readLine();
                    }
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    /*
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

    public void borrowSource(Member member, Source source) throws GuestBorrowException {
        if (source.isBorrowable()) {
            try {
                source.setReturnTimeout(member);
                source.setBorrowDate();
                source.setBorrowable(false);
                member.setBorrows_borrow(source);
            }
            catch (GuestBorrowException e) {
                e.getMessage();
            }
        }
    }

    public void returnSource(Member member, Source source) throws ReturnError {
        boolean flag = false;
        for (Source sourceSearch : member.getBorrows()) {
            if (sourceSearch == source) {
                flag = true;
                break;
            }
        }
        if (flag) {
            source.setReturnDate();
            source.setBorrowable(true);
            member.setBorrows_return(source);
        }
        else
            throw new ReturnError(member, source);
    }

    */
}