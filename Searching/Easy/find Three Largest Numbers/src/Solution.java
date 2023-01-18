import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution {

    public static int [] findThreeLargestNumbers(int[] arr){
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;

        for(int i  = 0 ; i < arr.length; i++){
            if(arr[i] > max1){
                max3 = max2;
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2) {
                max3 = max2;
                max2 = arr[i];
            } else if (arr[i] > max3) {
                max3 = arr[i];
            }
        }
        int result[] = {max3, max2, max1};

        return  result;
    }
    public static void main(String[] args) {
        int [] array = {141, 1, 17, -7, -17, -27, 18, 541, 8, 7, 7};
        System.out.println(Arrays.toString(Solution.findThreeLargestNumbers(array)));
    }
}