/*  3) WAP to print this star pyramid  pattern
        * * * * *
         * * * *
          * * *
          * *
           *
 */
package Loop;
public class star3_pyramid {
    public static void main(String[] args) {
        int number=5;
        for(int i=0;i<number;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=number;k>i;k--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
