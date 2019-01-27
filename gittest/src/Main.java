import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{

    /*
    public final static int bookRecordLenght = 0;
    public final static int magazineRecordLenght = 0;
    public final static int thesisRecordLenght = 0;
    public final static int studentRecordLenght = 0;
    public final static int teacherRecordLenght = 0;
    public final static int guestRecordLenght = 0;
    */

    @Override
    public void start(Stage stage) throws Exception {
        SceneManager.getInstance().setStage(stage);

        Parent root = FXMLLoader.load(getClass().getResource("firstPage.fxml"));
        SceneManager.getInstance().addScene("pageOne", new Scene(root));
        Parent root2 = FXMLLoader.load(getClass().getResource("secondPage.fxml"));
        SceneManager.getInstance().addScene("pageTwo", new Scene(root2));
        Parent root3 = FXMLLoader.load(getClass().getResource("sourcePage.fxml"));
        SceneManager.getInstance().addScene("pageSource", new Scene(root3));

        SceneManager.getInstance().loadScene("pageOne");
        stage.show();
    }


    public static void main(String[] args) {
        launch(args) ;

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
                        String[] authorsArray = authors.split(" and ");
                        ArrayList<String> result = new ArrayList<>();
                        for (String author : authorsArray) {
                            result.add(author);
                        }
                        Book book = new Book(title, publishYear, result);
                        outputBooks.writeChars(book.getCode());
                        outputBooks.writeChars(book.getTitle());
                        outputBooks.writeInt(book.getPublishYear());
                        outputBooks.writeChars(authors);
                        outputBooks.writeBoolean(book.isBorrowable());
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
                        outputTheses.writeChars(thesis.getAuthor());
                        outputTheses.writeChars(thesis.getAuthorGrade().toString());
                        outputTheses.writeBoolean(thesis.isBorrowable());
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

    public static void addMember(File file) {

        BufferedReader input = null;
        DataOutputStream outputStudents = null;
        DataOutputStream outputTeachers = null;
        DataOutputStream outputGuests = null;
        try {
            input = new BufferedReader(new FileReader(file));
            outputStudents = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(new File("students.bin"))));
            outputTeachers = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(new File("teachers.bin"))));
            outputGuests = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(new File("guests.bin"))));
            try {
                String line = input.readLine();
                while (line != null) {
                    String[] items = line.split(",");
                    String firstName = items[1];
                    String lastName = items[2];
                    if (items[0].equalsIgnoreCase("student")) {
                        Student student = new Student(firstName, lastName);
                        outputStudents.writeChars(student.getCode());
                        outputStudents.writeChars(student.getFirstName());
                        outputStudents.writeChars(student.getLastName());
                        outputStudents.writeChars(Integer.toString(student.getRegistryDate().getYear() + 1900) + "/" + Integer.toString(student.getRegistryDate().getMonth() + 1) + "/" + student.getRegistryDate().getDate());
                    }

                    else if (items[0].equalsIgnoreCase("teacher")) {
                        Teacher teacher = new Teacher(firstName, lastName);
                        outputTeachers.writeChars(teacher.getCode());
                        outputTeachers.writeChars(teacher.getFirstName());
                        outputTeachers.writeChars(teacher.getLastName());
                        outputTeachers.writeChars(Integer.toString(teacher.getRegistryDate().getYear() + 1900) + "/" + Integer.toString(teacher.getRegistryDate().getMonth() + 1) + "/" + teacher.getRegistryDate().getDate());
                    }

                    else {
                        Guest guest = new Guest(firstName, lastName);
                        outputGuests.writeChars(guest.getCode());
                        outputGuests.writeChars(guest.getFirstName());
                        outputGuests.writeChars(guest.getLastName());
                        outputGuests.writeChars(Integer.toString(guest.getRegistryDate().getYear() + 1900) + "/" + Integer.toString(guest.getRegistryDate().getMonth() + 1) + "/" + guest.getRegistryDate().getDate());
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
                outputStudents.close();
                outputTeachers.close();
                outputGuests.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static void borrowSource(String Sourcecode, String Membercode) {

    }

    /*

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