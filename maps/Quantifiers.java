package maps;

public class Quantifiers {
    public static void main(String[] args) {
        String patt = "abc(xyz){2,6}";
        String s1 = "abcxyz";
        System.out.println(s1.matches(patt));
    }
}
