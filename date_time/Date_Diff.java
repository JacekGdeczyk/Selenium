package date_time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class Date_Diff {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.of(1945, 12, 12);

        Period p = Period.between(d1,LocalDate.now());
        System.out.println("The Difference is " + p.getYears() + " Years " + p.getMonths() + " Months " + p.getDays() + " Days");

        System.out.println(p.toTotalMonths());

        LocalTime t1 = LocalTime.of(13,05);

        Duration d = Duration.between(t1,LocalTime.now());
        System.out.println("The Difference is " + d.toMinutes() + " Minutes");
    }
}
