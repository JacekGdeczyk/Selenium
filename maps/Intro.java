package maps;

public class Intro {
    public static void main(String[] args) {
        String s1 = "+1-678-675-(8765)";
        String s2 =  s1.replace("+","").replace("-","").replace("(","").replace(")","");
        System.out.println(s2);
        String patt = "[^A-Za-z0-9]";
        String s3 = s1.replaceAll(patt,"");
        System.out.println(s3);

    }
}
