import java.util.*;
public class array {
    public static void main(String[] args) {
        int n = 10;
        ///////////////////one dimention array
        int[] arr = new int[n];
        arr[1] = 5;
        arr[3] = 5;
        System.out.println(Arrays.toString(arr));
        int[] arr1 = {3,5,2,6,4,9,8,1,7};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        ////////////////////two diamention array
        int[][] multi = new int[2][3];
        System.out.println(Arrays.deepToString(multi));
        
        ///////////constants
        final double PI = 22/7F;
        System.out.println(PI);
    
    }
}