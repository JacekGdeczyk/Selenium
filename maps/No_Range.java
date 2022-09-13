package maps;

public class No_Range {
    public static void main(String[] args) {

        String patt = "2[2-3]|[0-9]|240 ";
        String str1 = "100";
        System.out.println(str1.matches(patt));


    }
}
