package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLIst {
    public static void main(String[] args) {
//        System.out.println("Set up is ready for Collections");
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(0,10);
        list.add(1,12);
        list.add(1,62);
        list.add(2,14);
        list.add(1,16);
        list.add(1,58);
        System.out.println(list);
        //size() to find size of list
        //System.out.println(list.size());
        //list.set(1,20);
        //System.out.println(list);
        //System.out.println(list.contains(14));
        //System.out.println("here we use clone() method to add all element in clone");
        //Object clone = list.clone();
        //System.out.println(clone);
        System.out.println(Collections.max(list));
    }
}
