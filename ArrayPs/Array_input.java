// user input example of one dimensional array
package ArrayPs;

import java.util.*;
public class Array_input {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size;
      System.out.println("Enter size  ");
     size=sc.nextInt();
      int arr[]= new int[size];
         for(int i=0;i<size;i++){
             System.out.println("Enter element for  "+i+" index");
             arr[0]=sc.nextInt();
          }
        System.out.println("Array element is ");
        for(int a:arr){
            System.out.println(a);
        }
    }
}
