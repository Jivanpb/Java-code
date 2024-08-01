package Collections;
import java.util.*;
/*
Set
    no order of set
    unique value are allowed
 */
public class SeT_HashSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<Integer>();
        set.add(10);
        set.add(5);
        set.add(16);
        set.add(2);
        set.add(20);
        System.out.println(set);
    }
}
