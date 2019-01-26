import java.io.*;
import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

    }

    public static void addSource(File file) {

        BufferedReader input = null;
        DataOutputStream outputBooks = null;
        DataOutputStream outputMagazines = null;
        DataOutputStream outputTheses = null;
        try {
            input = new BufferedReader(new FileReader(file));
            outputBooks = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(new File("books.bin"))));
            outputMagazines = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(new File("magazines.bin"))));
            outputTheses = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(new File("theses.bin"))));
            try {
                String line = input.readLine();
                while (line != null) {
                    String[] items = line.split(",");
                    if (items[0].equalsIgnoreCase("book")) {
                        String title = items[1];
                        int publishYear = Integer.parseInt(items[2]);
                        String authors = items[3];
                        Book book = new Book(title, publishYear, authors);
                        outputBooks.writeChars(book.getCode());
                        outputBooks.writeChars(book.getTitle());
                        outputBooks.writeInt(book.getPublishYear());
                        outputBooks.writeChars(book.getAuthor());
                        outputBooks.writeBoolean(book.isBorrowable());
                        if (book.getBorrowDate() != null)
                            outputBooks.writeChars(Integer.toString(book.getBorrowDate().getYear() + 1900) + "/" + Integer.toString(book.getBorrowDate().getMonth() + 1) + "/" + book.getBorrowDate().getDate());
                        else
                            outputBooks.writeChars(0000 + "/" + 00 + "/" + 00);

                        if (book.getReturnDate() != null)
                            outputBooks.writeChars(Integer.toString(book.getReturnDate().getYear() + 1900) + "/" + Integer.toString(book.getReturnDate().getMonth() + 1) + "/" + book.getReturnDate().getDate());
                        else
                            outputBooks.writeChars(0000 + "/" + 00 + "/" + 00);

                        if (book.getBorrowDate() != null)
                            outputBooks.writeChars(Integer.toString(book.getBorrowDate().getYear() + 1900) + "/" + Integer.toString(book.getBorrowDate().getMonth() + 1) + "/" + book.getBorrowDate().getDate());
                        else
                            outputBooks.writeChars(0000 + "/" + 00 + "/" + 00);
                    }

                    else if (items[0].equalsIgnoreCase("magazine")) {
                        String title = items[1];
                        int magazineNumber = Integer.parseInt(items[2]);
                        String[] dateString = items[3].split("/");
                        Date publishDate = new Date(Integer.parseInt(dateString[0]) - 1900, Integer.parseInt(dateString[1]) - 1,Integer.parseInt(dateString[2]));
                        Magazine magazine = new Magazine(title, magazineNumber, publishDate);
                        outputMagazines.writeChars(magazine.getCode());
                        outputMagazines.writeChars(magazine.getTitle());
                        outputMagazines.writeInt(magazine.getMagazineNumber());
                        outputMagazines.writeChars(Integer.toString(magazine.getPublishDate().getYear() + 1900) + "/" + Integer.toString(magazine.getPublishDate().getMonth() + 1) + "/" + magazine.getPublishDate().getDate());
                        outputMagazines.writeBoolean(magazine.isBorrowable());
                        if (magazine.getBorrowDate() != null)
                            outputMagazines.writeChars(Integer.toString(magazine.getBorrowDate().getYear() + 1900) + "/" + Integer.toString(magazine.getBorrowDate().getMonth() + 1) + "/" + magazine.getBorrowDate().getDate());
                        else
                            outputMagazines.writeChars(0000 + "/" + 00 + "/" + 00);

                        if (magazine.getReturnDate() != null)
                            outputMagazines.writeChars(Integer.toString(magazine.getReturnDate().getYear() + 1900) + "/" + Integer.toString(magazine.getReturnDate().getMonth() + 1) + "/" + magazine.getReturnDate().getDate());
                        else
                            outputMagazines.writeChars(0000 + "/" + 00 + "/" + 00);

                        if (magazine.getBorrowDate() != null)
                            outputMagazines.writeChars(Integer.toString(magazine.getBorrowDate().getYear() + 1900) + "/" + Integer.toString(magazine.getBorrowDate().getMonth() + 1) + "/" + magazine.getBorrowDate().getDate());
                        else
                            outputMagazines.writeChars(0000 + "/" + 00 + "/" + 00);
                    }

                    else {
                        String title = items[1];
                        String[] dateString = items[2].split("/");
                        Date publishDate = new Date(Integer.parseInt(dateString[0]) - 1900, Integer.parseInt(dateString[1]) - 1,Integer.parseInt(dateString[2]));
                        String author = items[3];
                        String authorGrade = items[4];
                        Thesis thesis = new Thesis(title, publishDate, author, AuthorGrade.valueOf(authorGrade));
                        outputTheses.writeChars(thesis.getCode());
                        outputTheses.writeChars(thesis.getTitle());
                        outputTheses.writeChars(Integer.toString(thesis.getPublishDate().getYear() + 1900) + "/" + Integer.toString(thesis.getPublishDate().getMonth() + 1) + "/" + thesis.getPublishDate().getDate());
                        outputTheses.writeBoolean(thesis.isBorrowable());
                        if (thesis.getBorrowDate() != null)
                            outputTheses.writeChars(Integer.toString(thesis.getBorrowDate().getYear() + 1900) + "/" + Integer.toString(thesis.getBorrowDate().getMonth() + 1) + "/" + thesis.getBorrowDate().getDate());
                        else
                            outputTheses.writeChars(0000 + "/" + 00 + "/" + 00);

                        if (thesis.getReturnDate() != null)
                            outputTheses.writeChars(Integer.toString(thesis.getReturnDate().getYear() + 1900) + "/" + Integer.toString(thesis.getReturnDate().getMonth() + 1) + "/" + thesis.getReturnDate().getDate());
                        else
                            outputTheses.writeChars(0000 + "/" + 00 + "/" + 00);

                        if (thesis.getBorrowDate() != null)
                            outputTheses.writeChars(Integer.toString(thesis.getBorrowDate().getYear() + 1900) + "/" + Integer.toString(thesis.getBorrowDate().getMonth() + 1) + "/" + thesis.getBorrowDate().getDate());
                        else
                            outputTheses.writeChars(0000 + "/" + 00 + "/" + 00);
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
                outputBooks.close();
                outputMagazines.close();
                outputTheses.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    /*
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
    */
}