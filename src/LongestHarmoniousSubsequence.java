import java.util.HashMap;

public class LongestHarmoniousSubsequence {
    /*We define a harmonious array as an array where the difference between its maximum value and its minimum value is exactly 1.

Given an integer array nums, return the length of its longest harmonious subsequence among all its possible subsequences.



Example 1:

Input: nums = [1,3,2,2,5,2,3,7]

Output: 5

Explanation:

The longest harmonious subsequence is [3,2,2,2,3].

Example 2:

Input: nums = [1,2,3,4]

Output: 2

Explanation:

The longest harmonious subsequences are [1,2], [2,3], and [3,4], all of which have a length of 2.

Example 3:

Input: nums = [1,1,1,1]

Output: 0

Explanation:

No harmonic subsequence exists
Time complexity : O(n). Only one loop is there.

Space complexity : O(n). map size grows upto size n.

Instead of filling the map first and then traversing over the map to determine the lengths of the harmonic subsequences encountered, we can traverse over the nums array, and while doing the traversals, we can determine the lengths of the harmonic subsequences possible till the current index of the nums array.

The method of finding the length of harmonic subsequence remains the same as the last approach. But, this time, we need to consider the existence of both key+1 and key−1 exclusively and determine the counts corresponding to both the cases. This is needed now because it could be possible that key has already been added to the map and later on key−1 is encountered. In this case, if we consider the presence of key+1 only, we'll go in the wrong direction.

Thus, we consider the counts corresponding to both the cases separately for every key and determine the maximum out of them.
Thus, now the same task can be done only in a single traveral of the nums array.

*/
    public int findLHS(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int res=0;
        for(int i: nums){
            map.put(i,map.getOrDefault(i,0)+1);
            if(map.containsKey(i+1))
                res = Math.max(res,map.get(i)+map.get(i+1));
            if(map.containsKey(i-1))
                res = Math.max(res,map.get(i)+map.get(i-1));
        }
        return res;
    }

}
