package arrays;

public class Arr_2D_Exercise {
    public static void main(String[] args) {
        int[][] arr = new int[5][10];
        for (int i = 2; i <=6 ; i++) {
            for (int j = 1; j <=10 ; j++) {
                arr[i- 2][j-1] = i * j;
            }

        }
        for (int [] x : arr){
            for (int y : x){
                System.out.print(y + " ");
            }
            System.out.println("\n");
        }

        }
}
