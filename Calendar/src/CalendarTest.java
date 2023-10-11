import javax.xml.crypto.Data;
import java.util.Scanner;

public class CalendarTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Calendar calendar = new Calendar();
        Date date = new Date();

        while (true) {
            System.out.println("Please enter a date:");
            System.out.print("Day as number: ");
            date.setDay(scanner.nextInt());
            System.out.print("Month as in \"January\": ");
            date.setMonth(scanner.next());
            System.out.print("Year: ");
            date.setYear(scanner.nextInt());
            Date nextDay = calendar.nextDay(date);
            System.out.println("Next day: " + nextDay.getDay() + " " + nextDay.getMonth() + " " + nextDay.getYear());
        }
    }
}
