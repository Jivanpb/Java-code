// Program for Matrix demo(using Multidimension array)
package ArrayPs;
import java.util.Scanner;
public class Matrixdemo {
    public static void main(String[] args) {
        Scanner var3 = new Scanner(System.in);
        System.out.println("Enter the row");
        int var1 = var3.nextInt();
        System.out.println("Enter the column");
        int var2 = var3.nextInt();
        int[][] var4 = new int[var1][var2];

        int var5;
        int var6;
        for(var5 = 0; var5 < var1; ++var5) {
            for(var6 = 0; var6 < var2; ++var6) {
                System.out.println("Enter element for " + var5 + var6 + " Index");
                var4[var5][var6] = var3.nextInt();
            }
        }

        System.out.println("Matrix element is   ");

        for(var5 = 0; var5 < var1; ++var5) {
            for(var6 = 0; var6 < var2; ++var6) {
                System.out.println(var4[var5][var6] + " ");
            }

            System.out.println();
        }

    }
}
