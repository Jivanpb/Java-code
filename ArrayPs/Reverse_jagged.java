// 1) WAP to reverse row elements of jagged array?
package ArrayPs;

public class Reverse_jagged {
    public static void main(String[] args) {
        int[][] jagged_arr={{10,12,14},{30,32,34,36} };
        System.out.println("Original array");
        for(int i=0;i<jagged_arr.length;i++){
            for(int j=0;j<jagged_arr[i].length;j++){
                System.out.print(jagged_arr[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < jagged_arr.length; i++) {
            int start = 0;
            int end = jagged_arr[i].length - 1;
            while (start < end) {
                int temp = jagged_arr[i][start];
                jagged_arr[i][start] = jagged_arr[i][end];
                jagged_arr[i][end] = temp;
                start++;
                end--;
            }
        }

        System.out.println("Reverse array :");
        for(int i =0;i<jagged_arr.length;i++){
            for (int j=0;j<jagged_arr[i].length;j++){
                System.out.print(jagged_arr[i][j]+  " ");
            }
        }
    }
}
