import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

// Dates

public class Main {
    public static void main(String[] args) {
        // Date
        LocalDate todaysDate = LocalDate.now();
        System.out.println(todaysDate);
        // Time
        LocalTime currenTime = LocalTime.now();
        System.out.println(currenTime);
        // Date and Time
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        // Date and Time formatter
        DateTimeFormatter formattedDateTime = DateTimeFormatter.ofPattern("dd-MM-YYYY");
        DateTimeFormatter anotherDateTime = DateTimeFormatter.ofPattern("dd/MM/YYYY");
        DateTimeFormatter DayDateTime = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
        System.out.println(dateTime.format(formattedDateTime));
        System.out.println(dateTime.format(anotherDateTime));
        System.out.println(dateTime.format(DayDateTime));
    }
}
