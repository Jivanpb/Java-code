// jagged array is known as unstructured array and also another name of this array is ragged array
// row fixed but column not fixed
package ArrayPs;
import java.util.Scanner;
public class jagged {
    public static void main(String[] args) {
        int r,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row");
        r=sc.nextInt();
        int arr[][]= new int[r][];
        for (int i =0;i<r;i++){
            System.out.println("Enter column element for row " +i);
            c=sc.nextInt();
            arr[i]=new int[c];
            for(int j=0;j<c;j++){
                System.out.println("Enter Element for " +i+j+  "Index");
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Jagged array elements  is ");
        for(int i=0;i<r;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+"");
            }
            System.out.println();
        }
    }
}
