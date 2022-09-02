package Str;

public class StrOPS {
    public static void main(String[] args) {
        String s1 = "Jack Sparrow";
        String s2 = "Sparrow";

        System.out.println(s1.toLowerCase().contains(s2));
        System.out.println(s1.startsWith("J"));
        System.out.println(s1.endsWith("row"));
        System.out.println(s1.indexOf("Sparrow", 8));
        System.out.println(s1.lastIndexOf("Sparrow"));
    }
}
