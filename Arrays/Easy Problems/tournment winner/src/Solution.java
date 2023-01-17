import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class Solution {

    public static String tournment(String [][] competetions, int [] results){
        Map<String, Integer> resultCount = new Hashtable<>();

        for (int i = 0; i < competetions.length; i++) {
            if(resultCount.containsKey(competetions[i][0])){
                int currentValue = resultCount.get(competetions[i][0]);
                resultCount.put(competetions[i][0], currentValue + results[i]*3);
            }else {
                resultCount.put(competetions[i][0], results[i]*3);
            }

            if(resultCount.containsKey(competetions[i][1])){
                int currentValue = resultCount.get(competetions[i][1]);
                resultCount.put(competetions[i][1], currentValue + (1 - results[i])*3);
            }else {
                resultCount.put(competetions[i][1], (1 - results[i])*3);
            }
        }

        Set<String> keys = resultCount.keySet();

        int max = -1;
        String winner = "";
        for (String key: keys) {
            if(resultCount.get(key) > max){
                max = resultCount.get(key);
                winner = key;
            }
        }
        return winner;
    }

    public static void main(String[] args) {
        String [][] competeions = {{"Python", "HTML"}};
        int results [] = {0};

        System.out.println(Solution.tournment(competeions, results));

    }
}
