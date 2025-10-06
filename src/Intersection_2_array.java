import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Intersection_2_array {
    public int[] intersection(int[] nums1, int[] nums2) {
        /**
         * Time complexity: O(n+m) in the average case and O(n×m) in the worst case when the load factor is high enough.
         *
         * Space complexity: O(n) because we use a map of size n store the elements from nums1. The result array is just used to store the result, so it is not counted in the space complexity.
         */
        //Initialize seen map and result list
        Map<Integer,Integer> seen = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        //mark values occuring in nums1
        for(int x : nums1){
            seen.put(x,1);
        }
        //check if n is in dictionary and not in the result
        for(int x : nums2){
            if(seen.containsKey(x) && seen.get(x)==1){
                result.add(x);
                seen.put(x,0);
            }
        }
        //convert to int array and result the result
        return result.stream().mapToInt(i->i).toArray();
    }
}
