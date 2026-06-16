import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalTime rightNow = LocalTime.now();
        System.out.println(rightNow);

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
System.out.println();
        DateTimeFormatter fullDate = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        DateTimeFormatter longDate = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        DateTimeFormatter mediumDate = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        DateTimeFormatter shortDate = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);

        System.out.println("Full date: " + fullDate.format(today));
        System.out.println("Long date: " + longDate.format(today));
        System.out.println("Medium date: " + mediumDate.format(today));
        System.out.println("Short date: " + shortDate.format(today));

        String customPattern = "MM-dd-YYYY";

        DateTimeFormatter custom = DateTimeFormatter.ofPattern(customPattern);
        System.out.println(custom.format(today));

        int year = today.getYear();
        int month = today.getMonthValue();
        Month theMonth = today.getMonth();
        int theDay = today.getDayOfYear();
        DayOfWeek dayOfWeek = today.getDayOfWeek();
        int getHour = rightNow.getHour();
        int getMinute = rightNow.getMinute();
        int getNano = rightNow.getNano();
        System.out.println( year);
        System.out.println("Month:" + month);
        System.out.println("Month (name): " + theMonth);
        System.out.println("Day of the year: " + theDay);
        System.out.println("Day of the week: " + dayOfWeek);
        System.out.println("Hour: " + getHour);
        System.out.println("Minute: " + getMinute);
        System.out.println("Nanosecond: " + getNano);

        LocalDate finalDue = LocalDate.of(2023, Month.DECEMBER, 4);

        System.out.println(finalDue);
System.out.println();
        LocalTime gameStarts = LocalTime.of(9, 0, 0);

        System.out.println(gameStarts);

        long daysBetween = ChronoUnit.DAYS.between(today, finalDue);
        LocalDate codeExpires = today.plusDays(2);
        System.out.println("Code Expires Date: " + codeExpires);






    }
}