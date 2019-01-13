import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Date d = new Date();
        d.setHours(336 + d.getHours());
        d.setDate();
        System.out.println(d);
    }
}
