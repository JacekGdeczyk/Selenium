package maps;

import java.util.Iterator;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Maps_Itr {
    public static void main(String[] args) {
        var maps = new TreeMap<Integer,Double>();
        maps.put(1, Math.sqrt(200));
        maps.put(2, Math.sqrt(100));
        maps.put(3, Math.sqrt(50));
        maps.put(4, Math.sqrt(20));
        maps.put(5, Math.sqrt(10));
/*
        for (Entry<Integer,Double> e : maps.entrySet())  {
            System.out.println(e);
        }*/

        Iterator it = maps.entrySet().iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
