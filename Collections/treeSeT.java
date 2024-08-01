package Collections;
import java.util.*;
/*
TreeSet
Binary search tree
order is ascending
duplicate elements are not allowed
 */
public class treeSeT {
    public static void main(String[] args) {
    TreeSet<Integer> ts = new TreeSet<>();
    ts.add(22);
    ts.add(5);
    ts.add(10);
    ts.add(12);
    ts.add(6);
    ts.add(6);
        System.out.println(ts);
    }
}
