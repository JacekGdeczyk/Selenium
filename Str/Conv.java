package Str;

public class Conv {
    public static void main(String[] args) {

        int a = 100;
        System.out.println(Integer.toString(a));
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toHexString(a));
        System.out.println(Integer.toOctalString(a));

        String s1 = "100";
        String s2 = "1010101";
        String s3 = "64";
        String s4 = "144";

        System.out.println(Integer.parseInt(s1));
        System.out.println(Integer.parseInt(s2,2));
        System.out.println(Integer.parseInt(s3,16));
        System.out.println(Integer.parseInt(s4,8));
    }
}
