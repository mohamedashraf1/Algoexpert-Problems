import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static int nonConstruableChange(int [] coins){
        Arrays.sort(coins);

        int changeToBeCreated = 0 , changeCreated = 0;
        for (int i = 0; i < coins.length; i++) {
            changeToBeCreated = changeCreated + 1;
            if(coins[i] > changeToBeCreated)
                return changeToBeCreated;
            changeCreated += coins[i];
        }


        return changeCreated+1;
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
        int result =  nonConstruableChange(numbers);
        System.out.println(result);
    }
}
