import java.util.Arrays;
import java.util.Hashtable;
import java.util.Scanner;

public class Solution {


    public static int[] twoNumSum(int [] arr, int target){
        Hashtable<Integer, Integer> myMap = new Hashtable<>();
        int result [] = new int[2];

        // adding the array to a hashtable
        for (int i = 0; i < arr.length; i++) {
            int left = target - arr[i];
            if(myMap.containsKey(left)) {
                result[0] = arr[i];
                result[1] = left;
                return  result;
            }
            myMap.put(arr[i], arr[i]);
        }

        // if nothing found return an empty array
        return new int[0];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array : ");
        String line = sc.nextLine();
        String[] tokens = line.split(", ");
        int[] numbers = new int[tokens.length];
        for (int i=0; i<numbers.length;i++){
            numbers[i] = Integer.parseInt(tokens[i]);
        }
        System.out.println("Enter Target : ");
        int target = sc.nextInt();

        int result [] = twoNumSum(numbers, target);

        System.out.println(Arrays.toString(result));

    }
}
