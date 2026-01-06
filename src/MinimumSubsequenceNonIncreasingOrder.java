import java.util.ArrayList;
import java.util.List;

public class MinimumSubsequenceNonIncreasingOrder {
    public List<Integer> minSubsequence(int[] n) {
        int[] freq = new int[101];
        List<Integer> r = new ArrayList<>();
        int sum = 0;
        int subsum = 0;
        for(int i: n){
            sum += i;
            freq[i]++;
        }
        int half = sum/2;
        for(int i =100;i>=1 && subsum <=half; i--){
            int count = freq[i];
            while(count -- >0 && subsum <=half){
                r.add(i);
                subsum +=i;
            }
        }
        return r;
    }
}
