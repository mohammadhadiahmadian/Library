import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

    }

    public static void addSource(File file) {

        BufferedReader input = null;
        DataOutputStream output = null;
        try {
            input = new BufferedReader(new FileReader(file));
            output = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(new File("books.bin"))));
            try {
                String line = input.readLine();
                while (line != null) {
                    String[] items = line.split(",");
                    if (items[0].equalsIgnoreCase("book")) {
                        String title = items[1];
                        int publishYear = Integer.parseInt(items[2]);
                        String authors = items[3];
                        Book book = new Book(title, publishYear, authors);
                        output.writeChars(book.getCode());
                        output.writeChars(book.getTitle());
                        output.writeInt(book.getPublishYear());
                        output.writeChars(book.getAuthor());
                        output.writeBoolean(book.isBorrowable());
                        if (book.getBorrowDate() != null)
                            output.writeChars(Integer.toString(book.getBorrowDate().getYear() + 1900) + "/" + Integer.toString(book.getBorrowDate().getMonth() + 1) + "/" + book.getBorrowDate().getDate());
                        else
                            output.writeChars(0000 + "/" + 00 + "/" + 00);

                        if (book.getReturnDate() != null)
                            output.writeChars(Integer.toString(book.getReturnDate().getYear() + 1900) + "/" + Integer.toString(book.getReturnDate().getMonth() + 1) + "/" + book.getReturnDate().getDate());
                        else
                            output.writeChars(0000 + "/" + 00 + "/" + 00);

                        if (book.getBorrowDate() != null)
                            output.writeChars(Integer.toString(book.getBorrowDate().getYear() + 1900) + "/" + Integer.toString(book.getBorrowDate().getMonth() + 1) + "/" + book.getBorrowDate().getDate());
                        else
                            output.writeChars(0000 + "/" + 00 + "/" + 00);
                    }
                    else if (items[0] == "Magazine") {

                    }
                    else {

                    }
                    line = input.readLine();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            try {
                input.close();
                output.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static void addMember(File file) {

    }

    public static void borrowSource(String Sourcecode, String Membercode) {

    }

    public static void returnSource(String Sourcecode, String Membercode) {

    }

    public static ArrayList<Source> searchSource(String search) {
        ArrayList<Source> result = new ArrayList<>();
        return result;
    }

    public static ArrayList<Member> searchMember(String search) {
        ArrayList<Member> result = new ArrayList<>();
        return result;
    }

    public static ArrayList<Member> timeoutInfractions () {
        ArrayList<Member> result = new ArrayList<>();
        return result;
    }

}