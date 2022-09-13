package maps;

public class Brackets_Expressions {
    public static void main(String[] args) {
        String patt = "[^A-Za-z0-9_]at";
        String s1 = "%at";
        System.out.println(s1.matches(patt));
    }
}
