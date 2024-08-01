package Collections;
import java.util.*;
public class SortedSeT {
    public static void main(String[] args) {
        SortedSet<String> st = new TreeSet<String>();
        System.out.println("object created successfully");
        System.out.println("Names of district visit by i,'travel'");
        st.add("Ahilyanagar");
        st.add("Pune");
        st.add("Sambhajinar");
        st.add("Mumbai");
        System.out.println(st);
        // last() method show the last element int the st
        String last = st.last();
        System.out.println(" hello i last travel city is " + last);

        String first = st.first();
        System.out.println("hello i first travelled city is " + first);

        //System.out.println(st.getFirst())

        //System.out.println(st.getLast());

        //System.out.println(st.reversed());

        //st.removeLast();
        //System.out.println(st);

        //st.removeFirst();
        //System.out.println(st);


    }
}
