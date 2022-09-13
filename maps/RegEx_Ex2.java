package maps;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx_Ex2 {
    public static void main(String[] args) {
        String str = "Your total cost is $2400.990099 af ter $000.0099 sale discount and $12.09 coupon1 discount and $0.00 coupon2 discount";
        String pattern = "\\${1}\\d{1,}\\.\\d{1,}";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(str);
        while (m.find()){
            System.out.println(m.group());
        }


        //System.out.println(str.matches(pattern));
        //System.out.println(str.matches(pattern, 0));
    }
}
