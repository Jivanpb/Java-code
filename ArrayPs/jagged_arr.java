package ArrayPs;

public class jagged_arr {
    public static void main(String[] args) {
        int[][] jagged_arr={{1,2,3}, {2,1}, {3,5,6,8} };
        for(int i=0;i<jagged_arr.length;i++){
            for(int j=0;j<jagged_arr[i].length;j++){
                System.out.print(jagged_arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
