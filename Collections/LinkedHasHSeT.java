package Collections;
import java.util.*;
/*
LinkedHashSet
order is same
duplicate are not allowed in LinkedHashSet

 */
public class LinkedHasHSeT<I extends Number> {
    public static void main(String[] args) {
    LinkedHashSet<Integer> llset = new LinkedHashSet<>();
    llset.add(5);
    llset.add(2);
    llset.add(2);
    llset.add(10);
    boolean b = llset.contains(2);
        System.out.println("hey here we check 2 is preset "+b);
        System.out.println(llset);

    }
}
