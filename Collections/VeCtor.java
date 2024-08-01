package Collections;
import java.util.*;

public class VeCtor {
    public static void main(String[] args) {
        Vector<String> vector = new Vector();
        System.out.println(" list of city to visit by i , comrade");
        vector.add("Sambhajinagar");
        vector.add("Ahmednagr");
        vector.add("Pune");
        vector.add("Mumbai");
        vector.add("Indore");
        System.out.println(vector);
//        System.out.println("added all element in vector vector is look like follow");
        System.out.println("after remove indexed 2 number  element in vector vector is look like follow");
        vector.remove(2);
        System.out.println(vector);
        System.out.println("here we use vector.clear() method and then vector  is look like follow");
        vector.clear();
        System.out.println(vector);
        System.out.println("All element of in vector are deleted ,'its little bit complicated'");

    }
}
