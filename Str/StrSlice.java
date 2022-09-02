package Str;

public class StrSlice {
    public static void main(String[] args) {

        //String s1 = "ABCDE";
        /*System.out.print(s1.charAt(4));
        System.out.print(s1.charAt(3));
        System.out.print(s1.charAt(2));
        System.out.print(s1.charAt(1));
        System.out.print(s1.charAt(0));*/

       /* String temp = "";
        for (int i = 0; i <=s1.length()-1 ; i++) {
            temp = s1.charAt(i) + temp;
        }
        System.out.println(temp);

        System.out.println(s1.substring(1,3));*/

        String s1 = "A_B_C_D";
        String s2 = "B";
        String [] arr = s1.split(s2);

        for (String x: arr){
            System.out.println(x);
        }

    }
}
