import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Minimum_Absolute_Difference {
    //sort original array
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> answer = new ArrayList();
        //intialize minimum difference as a huge integer in order not.
        //to miss the absolute difference of first pair.
        int min = Integer.MAX_VALUE;
        //traverse sorted array and calculate the minimum absolute difference.
        for (int i = 0; i < arr.length - 1; i++) {
            min = Math.min(min, arr[i + 1] - arr[i]);
        }
        //traverse sorted array and check every pair again, if absolute difference equals the minimum difference and add this pair to answer list.
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] == min) {
                answer.add(Arrays.asList(arr[i], arr[i + 1]));
            }
        }
        return answer;
    }
}