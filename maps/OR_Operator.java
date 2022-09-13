package maps;

public class OR_Operator {
    public static void main(String[] args) {

        /*
        OR - Operator [|]
         */


        String patt = "a(b|c|d|xyz|123)";
        String s1 = "acd";
        System.out.println(s1.matches(patt));
    }
}
