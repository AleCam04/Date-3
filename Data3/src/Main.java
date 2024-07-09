import java.time.*;

public class Main {
    public static void main(String[] args) {

        OffsetDateTime date = OffsetDateTime.parse("2002-03-01T13:00:00Z");

        int year = date.getYear();
        Month month = date.getMonth();
        int dayMonth = date.getDayOfMonth();
        DayOfWeek dayWeek = date.getDayOfWeek();

        System.out.println(year);
        System.out.println(month);
        System.out.println(dayMonth);
        System.out.println(dayWeek);

    }
}