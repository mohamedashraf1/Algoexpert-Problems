public class Solution {
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