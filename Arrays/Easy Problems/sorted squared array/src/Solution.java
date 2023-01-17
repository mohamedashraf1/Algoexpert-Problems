import java.util.Arrays;

public class Solution {

    public static int [] sortedSquaredArray(int [] arr){
        int[] newArr = new int[arr.length];

        int start = 0, end = arr.length -1, newArrIndx = arr.length -1;
        while (start <= end){
            if(Math.abs(arr[start]) >= Math.abs(arr[end])){
                newArr[newArrIndx] = arr[start] * arr[start];
                start++;
            }else {
                newArr[newArrIndx] = arr[end] * arr[end];
                end--;
            }
            newArrIndx--;
        }

        return newArr;
    }

    public static void main(String[] args) {
        int [] arr = {-1};

        int[] newArr = Solution.sortedSquaredArray(arr);

        System.out.println(Arrays.toString(newArr));
    }
}
