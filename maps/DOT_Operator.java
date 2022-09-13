package maps;

public class DOT_Operator {
    public static void main(String[] args) {
        String patt = "ABC.";

        String s1 = "ABC9";

        String patt1 = "ABC.*";

        String s2 = "ABC^iwehui8d8";


        System.out.println(s2.matches(patt1));
    }
}
