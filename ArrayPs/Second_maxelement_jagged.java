//   2) WAP to find second max element of jagged row?
package ArrayPs;

public class Second_maxelement_jagged {
    public static void main(String[] args) {
        int a[][] = new int[3][];
        a[0] = new int[2];
        a[1] = new int[3];
        a[2] = new int[1];
        a[0][0] = 12;
        a[0][1] = 23;
        a[1][0] = 21;
        a[1][1] = 17;
        a[1][2] = 28;
        a[2][0] = 28;
        int max = a[0][0];
        int smax = a[0][0];
        for (int i = 0; i < 3; i++) {
            for(int j =0;j<a[i].length;j++) {
                if (max < a[i][j])
                    max = a[i][j];
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (smax < a[i][j] && max != a[i][j])
                    smax = a[i][j];
            }
        }
        System.out.println("Max element is " +max);
        System.out.println("Second Max element is " +smax);
    }
}
