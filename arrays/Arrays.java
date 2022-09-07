package arrays;

public class Arrays {
    public static void main(String[] args) {
        String [] DaysOfWeek = {"Mon", "Tue", "Wed","Thu","Fri","Sat","Sun"};
        System.out.println(DaysOfWeek.length);
        System.out.println(DaysOfWeek[2]);
        DaysOfWeek[2] = "AAA";
        System.out.println(DaysOfWeek[2]);
        //System.out.println(DaysOfWeek[10]);
        //DaysOfWeek [10] = "BBB";
        //System.out.println(DaysOfWeek[10]);
        for (int i = 0; i <=DaysOfWeek.length-1 ; i++) {
            System.out.println(DaysOfWeek[i]);
            
        }
        int[]arr1 = {12,3,34,34,65,765,678,87654,456};
        char[]arr2  = {'a','e','i'};
    }
}
