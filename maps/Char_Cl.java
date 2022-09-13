package maps;

public class Char_Cl {
    public static void main(String[] args) {
        String patt = "678\\w{2,6}\\W{2}";
        String s1 = "rtTYOIU*(";
        System.out.println(s1.matches(patt));

    }
}
