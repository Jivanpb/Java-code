/*   1) WAP to print this star pyramid  pattern
        *
        * *
        * * *
        * * * *
        * * * * *
        * * * * * *

 */

package Loop;
public class star1_pyramid {
    public static void main(String[] args) {
        int num = 5;
        for (int i = 0; i <= num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
