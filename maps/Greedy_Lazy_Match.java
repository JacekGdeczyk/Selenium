package maps;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Greedy_Lazy_Match {
    public static void main(String[] args) {
        String s1 = "XXsjifYYsjkhXXdklcnskvnjkvYYsdnjknsd";

        String patt = "XX.*?YY";

        Pattern p = Pattern.compile(patt);

        Matcher m = p.matcher(s1);

        System.out.println(m.results().count());

        m.reset();

        while(m.find()) {
            System.out.println("Starts at:" + m.start());
            System.out.println(m.group());
        }

    }
}
