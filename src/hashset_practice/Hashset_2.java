package hashset_practice;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset_2 {
    public static void main(String[] args) {

        HashSet<Integer> set=new HashSet<>();
        set.add(1);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(3);

        //size af element
        System.out.println("print the size all element="+set.size());

        //print all element
        System.out.println("all element ="+set);

        //contain search
       if(set.contains(1)){
           System.out.println("it is set contain");
       }
       if (!set.contains(4)){
           System.out.println("it does not set contain");
       }
       //remove element
        set.remove(1);
        if (!set.remove(1)){
            System.out.println("we deleted this contain");
        }
        System.out.println("print size of the element="+set.size());
        System.out.println("print element="+set);

        //Iterator
        Iterator it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
