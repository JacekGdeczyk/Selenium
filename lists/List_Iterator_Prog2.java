package lists;

import java.util.LinkedList;
import java.util.ListIterator;

public class List_Iterator_Prog2 {
    public static void main(String[] args) {
        //up all odd to even
     var  list = new LinkedList<Integer>();
        list.add(10);
        list.add(23);
        list.add(30);
        list.add(40);
        list.add(55);
        list.add(63);
        list.add(70);

        ListIterator itr = list.listIterator();
while (itr.hasNext()) {
            int i = (int) itr.next();
            if (i % 2 == 1){
                i++;
                itr.set(i);
            }
        }
System.out.println(list);

    }
}
