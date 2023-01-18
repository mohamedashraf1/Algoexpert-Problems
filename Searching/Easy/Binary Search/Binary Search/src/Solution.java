public class Solution {

    public static int search(int [] arr, int target){
        int start = 0, end = arr.length - 1, mid = (start + end)/2;

        while (start <= end){
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] > target){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
            mid = (start + end)/2;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {0, 1, 21, 33, 45, 45, 61, 71, 72, 73};
        int target = 5;
        System.out.println(Solution.search(arr, target));
    }
}