import java.util.HashSet;
import java.util.Set;
import java.util.*;
public class duplicate_with_k {

    /**
     * Example 1:
     *
     * Input: nums = [1,2,3,1], k = 3
     * Output: true
     * Example 2:
     *
     * Input: nums = [1,0,1,1], k = 1
     * Output: true
     * Example 3:
     *
     * Input: nums = [1,2,3,1,2,3], k = 2
     * Output: false
     Time complexity : O(n).
     We do n operations of search, delete and insert, each with constant time complexity.

     Space complexity : O(min(n,k)).
     The extra space required depends on the number of items stored in the hash table, which is the size of the sliding window, min(n,k).
     */
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){ // Search current element in the HashTable, return true if found.
                return true;
            }
            set.add(nums[i]);
            //Put current element in the HashTable
            if(set.size()>k){
                set.remove(nums[i-k]);
            }
        }
        return false;
    }
}
