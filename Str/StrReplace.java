package Str;

public class StrReplace {
    public static void main(String[] args) {
        /*String s1 = "Jacek Gdeczyk44";
        String s2 = "44";
        String s3 = " Król";
        System.out.println(s1.replace(s2,s3));*/

        String s = "J98ac0001ek2 G4de3czyk4";
        String patt = "[0-9]";
        System.out.println(s.replaceAll(patt,""));

    }
}
