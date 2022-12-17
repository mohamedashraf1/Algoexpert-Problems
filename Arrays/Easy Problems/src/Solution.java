import java.util.Hashtable;
import java.util.Scanner;
import java.util.Set;

public class Solution {


    public static int[] twoNumSum(int [] arr, int target){
        Hashtable<Integer, Integer> myMap = new Hashtable<>();
        // adding the array to a hashtable
        for (int i = 0; i < arr.length; i++) {
            myMap.put(arr[i], arr[i]);
        }

        int result [] = new int[2];
        // getting the set of keys from the map to loop through it
        Set<Integer> setOfKeys = myMap.keySet();

        // subtract the key from the target and search for it in the hashtable
        for (Integer key: setOfKeys) {
            int left = target - key;
            if(myMap.containsKey(left)){
                result[0] = key;
                result[1] = left;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array : ");
        String line = sc.nextLine();
        String[] tokens = line.split(" ");
        int[] numbers = new int[tokens.length];
        for (int i=0; i<numbers.length;i++){
            numbers[i] = Integer.parseInt(tokens[i]);
        }
        System.out.println("Enter Target : ");
        int target = sc.nextInt();

        int result [] = twoNumSum(numbers, target);

        System.out.print("["+result[0]+" , " + result[1]+"]");

    }
}