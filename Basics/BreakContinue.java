package Basics;

public class BreakContinue {
    public static void main(String[] args) {
        int a=100;
        while (a>50){
            a-=5;
            if (a==75){
                continue;
            }
            System.out.println(a);
        }
    }
}
