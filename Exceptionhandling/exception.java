package Exceptionhandling;


import java.io.BufferedReader;
import java.io.FileReader;

public class exception {
    public static void main(String[] args) {
        System.out.println("All ok");
        System.out.println(1);
        System.out.println(2);
        System.out.println(3/3);
        try {
            System.out.println(4 / 0);
        }
        catch (Exception e) {
            System.out.println(e);
            System.out.println("execption handle successfully");
        }
//        finally {
//            System.out.println(" i am in finally block");
//        }


    }
}
