package maps;

import java.util.HashMap;

public class Hash_Map {
    public static void main(String[] args) {
        var map = new HashMap<Integer, String>();
        map.put(1, "Jan");
        map.put(2, "Feb");
        map.put(3, "Mar");
        map.put(4, "Apr");
        map.put(5, "May");
        map.put(6, "Jun");
        map.put(7, "Jul");
        map.put(8, "Aug");
        map.put(9, "Sep");

        System.out.println(map.get(1));
        System.out.println(map.containsKey(2));
        map.put(3,"Dec");
        //map.remove(2);
        //map.remove(5,"May1");

        var set1 = map.keySet();
        var set2 = map.values();
        var set3 = map.entrySet();

        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set3);

        System.out.println(map);


    }
}
