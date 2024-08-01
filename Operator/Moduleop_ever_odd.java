// program for check odd or even number
package Operator;
import java.util.Scanner;
public class Moduleop_ever_odd {
    public static void main(String[] args) {
        int a;
        System.out.println("enter the number which you want to check odd or even : " );
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        for(int i=a; ;){
            if(i % 2 == 0){
                System.out.println("the number is even " +i);
                break;
            }
            else {
                System.out.println("the number is odd " +i);
                break;
            }
        }
    }
}
