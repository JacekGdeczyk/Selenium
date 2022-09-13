package exeptions;

public class Finally_Block {
    public static void main(String[] args) {
        int a = 100;
        int b = 10;

        try {
            int c = a / b;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Hello World");
        }

    }
}
