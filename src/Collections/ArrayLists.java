package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList <Integer> list =new ArrayList<Integer>();
        //add element
        for (int i=0;i<=5;i++){
            list.add(i);
        }
        //get element
        for (int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        Iterator i =list.iterator();
       while (i.hasNext()){
           System.out.print(i.next()+ " ");
       }

        //add element in between
        list.add(1,100);
        System.out.println(list);
        //set(update) element at particular index
        list.set(1,500);
        //delete
        list.remove(3);
        System.out.println(list);

        //sorting
        Collections.sort(list);
        System.out.println(list);

    }
}
