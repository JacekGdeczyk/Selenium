package arrays;

import java.util.Scanner;

public class Enhanced_For_Loop {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter a no: ");
        int num1 = s1.nextInt();
        int[] arr = new int[10];
        for (int i = 1; i <= 10; i++) {
            arr[i - 1] = num1 * i;
        }
        System.out.println("-----------");

        for (int n : arr) {
            System.out.println(n);


        }


    }
}
