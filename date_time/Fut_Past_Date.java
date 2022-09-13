package date_time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Fut_Past_Date {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.now().plusMonths(3);
        System.out.println(d1);

        LocalDate d2 = LocalDate.now().minusMonths(3);
        System.out.println(d2);

        LocalDate d3 = LocalDate.now().plusYears(3);
        System.out.println(d3);
        LocalDate d4 = LocalDate.now().minusYears(3);
        System.out.println(d4);
        LocalDate d5 = LocalDate.now().plusDays(3);
        System.out.println(d5);
        LocalDate d6 = LocalDate.now().minusDays(3);
        System.out.println(d6);
        LocalDate d7 = LocalDate.now().plusWeeks(3);
        System.out.println(d7);
        LocalDate d8 = LocalDate.now().minusWeeks(3);
        System.out.println(d8);
        LocalDate d9 = LocalDate.now().plus(10, ChronoUnit.CENTURIES);
        System.out.println(d9);

        LocalTime t1 = LocalTime.now().plusHours(2);
        System.out.println(t1);
        LocalTime t2 = LocalTime.now().minusHours(2);
        System.out.println(t2);
        LocalTime t3 = LocalTime.now().plusMinutes(2);
        System.out.println(t3);
        LocalTime t4 = LocalTime.now().minusMinutes(2);
        System.out.println(t4);
        LocalTime t5 = LocalTime.now().plusSeconds(2);
        System.out.println(t5);
        LocalTime t6 = LocalTime.now().minusSeconds(2);
        System.out.println(t6);
        LocalTime t7 = LocalTime.now().plusNanos(2);
        System.out.println(t7);
        LocalTime t8 = LocalTime.now().minusNanos(2);
        System.out.println(t8);
        LocalTime t9 = LocalTime.now().plus(10, ChronoUnit.MILLIS);
        System.out.println(t9);


    }
}
