package arrays;

public class Arr_Of_Object {
    public static void main(String[] args) {
        Object[][] arr = {
                {"Ola", 33, 1.5, 'f'},
                {"Zenek", 34, 1.8, 'm'},
                {"Olek", 30, 1.7, 'm'},
                {"Mania", 35, 1.6, 'f'}
        };

        for (Object []x : arr) {
            for (Object y : x) {
                System.out.println(y + " ");

            }
            System.out.println("\n");
        }
    }
}