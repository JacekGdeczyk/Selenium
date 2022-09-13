package maps;

public class RegEx_Ex1 {
    public static void main(String[] args) {

        String patt = "www\\.(dezlearn|dez)\\.(com|us)";
        String str1 = "www.dez.com";
        System.out.println(str1.matches(patt));
    }
}
