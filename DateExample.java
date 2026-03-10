import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateExample {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.print("now: +now");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDate = now.format(formatter);
        System.out.println("Formatted: " + formattedDate);
    }
}