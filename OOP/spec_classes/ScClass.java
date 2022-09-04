package OOP.spec_classes;

import java.util.Scanner;

public class ScClass {
    public static void main(String[] args) {
        /*Scanner s1 = new Scanner(System.in);
        System.out.println("Please enter a string:");
        String st1 = s1.nextLine();
        System.out.println(st1);*/

        /*Scanner s1 = new Scanner(System.in);
        System.out.println("Please enter a string:");
        String st1 = s1.nextLine();
        String temp = "";
        for (int i = 0; i <= st1.length()-1 ; i++) {
            temp = st1.charAt(i) + temp;
        }
        System.out.println("Reversed: " + temp);*/

        Scanner s1 = new Scanner(System.in);
        System.out.println("Please enter a string:");
        String st1 = s1.nextLine();
        int a = s1.nextInt();
        String temp = "";
        for (int i = 0; i <= st1.length()-1 ; i++) {
            temp = st1.charAt(i) + temp;
        }
        System.out.println("Reversed: " + temp);
    }
}
