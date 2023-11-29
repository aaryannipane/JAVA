import java.time.*;
import java.time.format.DateTimeFormatter;

public class Code {
    public static void main(String[] args) {

        // link: https://www.w3schools.com/java/java_date.asp

        // To display the current date, import the java.time.LocalDate class, and use
        // its now() method:

        LocalDate date = LocalDate.now();
        System.out.println(date);

        // To display the current time (hour, minute, second, and nanoseconds), import
        // the java.time.LocalTime class, and use its now() method:
        LocalTime time = LocalTime.now();
        System.out.println(time);

        // To display the current date and time, import the java.time.LocalDateTime
        // class, and use its now() method:

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        /*
         * Formatting Date and Time
         * The "T" in the example above is used to separate the date from the time. You
         * can use the DateTimeFormatter class with the ofPattern() method in the same
         * package to format or parse date-time objects. The following example will
         * remove both the "T" and nanoseconds from the date-time:
         */

        DateTimeFormatter foramter = DateTimeFormatter.ofPattern("E, dd-MM-yyyy HH:mm:ss");
        
        String formatedDateTime = foramter.format(dateTime);
        System.out.println(formatedDateTime);


    }
}
