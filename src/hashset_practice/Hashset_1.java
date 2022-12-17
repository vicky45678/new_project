package hashset_practice;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset_1 {

    public static void main(String[] args) {

        // create
        HashSet<String> set=new HashSet<>();
        set.add("vaibhav");
        set.add("rahul");
        set.add("kiran");
        set.add("vipin");
        set.add("vaibhav");

        //print size element
        System.out.println("print all element size "+set.size());

        //print all element
        System.out.println("print all element "+set);

        //search contain
        if (set.contains("rahul")){
            System.out.println("it is set contain");
        }
        if (!set.contains("vikas")){
            System.out.println("it does not set contain");
        }

        //deleted
        set.remove("vaibhav");
        if (!set.contains("vaibhav")){
            System.out.println("we do deleted this contain");
        }

        //iterator
        //there are two function .next(),hasnext()
        Iterator it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }

}
