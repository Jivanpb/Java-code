/*
    what is object array ?
    --> it is a collection of disimilar type of elements becasue we
        can store all type of element using object array.
        Object is the super class in java hence it contain any tupe of elements.
        We can also create object array for userdefine object.
        for example student is the class then we can create student
        object type array to store multiple student record in a proper sequence.

        Object arr [] ={valu1,'value2;,value3,floatvalue,charvalue};

         it is used for database select operation using JDBC.

 */

// program to display elements using object array
package ArrayPs;
public class Object_array {
    public static void main(String[] args) {
        Object arr[]= {"hello",true,12.345F,'a'};
        // display elements of Object array using for loop
        for(int i=0;i<arr.length;i++){
          System.out.println(arr[i]);
        }

        // display object array element using for each loop
        for(Object o : arr){
            System.out.println(o);
        }
    }
}
