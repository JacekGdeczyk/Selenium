package maps;

import java.util.TreeMap;

public class Tree_Map {
    public static void main(String[] args) {
        var maps = new TreeMap<Character, Integer>();
        maps.put('d', 1);
        maps.put('a', 2);
        maps.put('c', 3);
        maps.put('b', 4);

        System.out.println(maps.containsValue(1));
        //maps.put('a', 20);
        //maps.replace('a',20);

        //System.out.println(maps.firstEntry());
        //System.out.println(maps.lastEntry());
        //System.out.println(maps.firstKey());
        //System.out.println(maps.lastKey());
    System.out.println(maps.pollFirstEntry());
    System.out.println(maps.pollLastEntry());
    }
}
