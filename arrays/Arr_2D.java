package arrays;

public class Arr_2D {
    public static void main(String[] args) {
        String[][] arr =
                {
                        {"Mon","Tue","Wed"},
                        {"Thu"},
                        {"Fri","Sat","Sun"}
                };
        System.out.println(arr.length);
        System.out.println(arr[2].length);

        System.out.println(arr[2][0]);
        arr[2][1] ="AAA";
        System.out.println(arr[2][1]);
        System.out.println(arr[2][0]);
        for (String[]x : arr){
            for (String y : x){
                System.out.println(y);
            }
            System.out.println("-----------");

        }

    }
}
