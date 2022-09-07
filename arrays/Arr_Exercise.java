package arrays;

public class Arr_Exercise {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int j = arr.length - 1;
        int temp = 0;

        for (int i = 0; i < (arr.length - 1) / 2; i++) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;

        }
        for (int x : arr){
            System.out.println(x);
        }
    }
}
