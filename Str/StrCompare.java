package Str;

public class StrCompare {
    public static void main(String[] args) {

        String str1 = "Jack";
        String str2 = "Jack";

        System.out.println(str1.equals(str2));

        String str3 = "jack";
        String str4 = "Jack";

        System.out.println(str3.equalsIgnoreCase(str4));

        System.out.println(str1.compareTo(str2));
        System.out.println(str3.compareTo(str4));

        String patt = "[A-Z] {1,}";
        System.out.println(str1.matches(patt));
    }
}
