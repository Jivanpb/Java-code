package Collections;
import java.util.*;
public class HashMaP {
    public static void main(String[] args) {
//        HashMap<Integer,String> hmapp = new HashMap<Integer,String>();
//        hmapp.put(10,"Jivan");
//        hmapp.put(14,"Sambhaji");
//        hmapp.put(17,"Mahesh");
//        System.out.println(hmapp.get(10));
//        System.out.println(hmapp);
        /*
        HashMap<String,Integer> hmap = new HashMap<String,Integer>();
        hmap.put("Second",20);
        hmap.put("First",5);
        System.out.println("HashMap hmap is " +hmap);
        System.out.println(hmap.get("Second"));
        System.out.println(hmap.keySet());
        System.out.println(hmap.values());
        */
        /*
        System.out.println("here we start TreeMap ");
        TreeMap<String,Integer> tmap =new TreeMap<String,Integer>();
        tmap.put("Second",20);
        tmap.put("First",5);
        System.out.println("TreeeMap tmap is " +tmap);
        System.out.println(tmap.get("First"));
        System.out.println(tmap.keySet());
        System.out.println(tmap.values());

        int arr[]= {1,20,3,40,5,6,7,7};
        for(int num:arr){
            System.out.print(num+",");
        }
        System.out.println();
        Arrays.sort(arr);
        for(int num1:arr){
            System.out.print(num1+",");
        }
        System.out.println(Arrays.binarySearch(arr,40));

         */

        ArrayList<String> myList = new ArrayList<>();
        myList.add("Second");
        myList.add("First");
        myList.add("Third");
        System.out.println(myList);
        Collections.sort(myList);
        System.out.println(myList);

        System.out.println("MAX   " +Collections.max(myList));
        System.out.println("MIN   " +Collections.min(myList));

        Iterator it = myList.iterator();
        while(it.hasNext()) {
            System.out.println("List values  "+it.next());
        }
    }
}
