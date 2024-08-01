// WAP a program to print all tables using for loop
package Loop;
import java.util.Scanner;
public class All_table {
    public static void main(String[] args) {
        System.out.println("Welcome comrade   " + " Please enter number :");
        int number;
        Scanner sc = new Scanner(System.in);
         number=sc.nextInt();
        System.out.println("the table of " +number);
         for(int i =1;i<=10;i++){
             System.out.printf("%d * %d = %d\n",number,i,number * i);
         }
    }
}
