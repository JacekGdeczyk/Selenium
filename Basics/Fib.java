package Basics;

public class Fib {
    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 1;
        int num3;
        System.out.println(num1);
        System.out.println(num2);
        for (int i = 1; i <= 18 ; i++) {
            num3 = num1+num2;
            System.out.println(num3);
            num1=num2;
            num2=num3;
            
        }
    }

    

}
