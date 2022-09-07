package OOP.GC;

public class GC {
    public static void main(String[] args) {
        String st1 = "abcde";
        for (int i = 0; i <=st1.length()-1 ; i++) {
            String temp = "ch" + i + ":" + st1.charAt(i);
        }
    }
}
