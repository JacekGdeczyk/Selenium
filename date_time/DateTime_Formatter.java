package date_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTime_Formatter {
    public static void main(String[] args) {

        String s1 = "24/04/86";

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("[MM-dd-yyyy][MMM-dd-yyyy][dd/MM/yy]")    ;

        LocalDate d1 = LocalDate.parse(s1, dtf);

        System.out.println(d1);
    }
}
