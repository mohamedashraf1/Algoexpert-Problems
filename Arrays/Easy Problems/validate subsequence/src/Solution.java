public class Solution {

    public static boolean validate(int[] array, int[] subArray){

        int j = 0;
        boolean checker = false;
        for (int i = 0; i < array.length; i++) {
            if(j <= subArray.length - 1 && array[i] == subArray[j]){
                j++;
            }
            if(j == subArray.length){
                checker = true;
                break;
            }
        }

        return checker;
    }

    public static void main(String[] args) {
        int[] array = {5, 1, 22, 25, 6, -1, 8, 10};
        int[] subArray = {1, 6, -1, -1, 10};

        System.out.println(Solution.validate(array, subArray));
    }
}
