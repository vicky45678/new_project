package javapractic;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

//notes
//arraylist stored in heap memories
/*Array=1 we can store primitive data like int, float
        2 we can store object
 */
/*Arraylist=we store Object
    operation in arraylist
      1=add(add in element)
      2=
      3=modify(kisi bhi chij ko modify krne ke liye)
      4=delete (element ko delete krna)
      5=iterate/operation
*/
public class Java_Arraylist_practice {
    public static void main(String[] args) {
        //create Arralist isme ham capital later ki data type use krenge like Integer,String, Boolean
        ArrayList<Integer> list=new ArrayList<>();
        //use add element
        list.add(0);
        list.add(1);
        list.add(2);
        System.out.println(list);

        //use get element
        int element=list.get(0);
        System.out.println(element);

        //add element in between
        list.add(1,2);
        System.out.println(list);

        //set element
        list.set(0,5);
        System.out.println(list);

        //delete element
        list.remove(3);
        System.out.println(list);

        //size list ka size
        int size=list.size();
        System.out.println(size);

        //loop/iterate on the list    isme ham loops ko bhi lga skte h
        for (int i=0; i<list.size(); i++){
            System.out.print(list.get(i));
        }
        System.out.println();

        //sorting
        Collections.sort(list);
        System.out.println(list);



    }
}
