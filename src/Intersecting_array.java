import java.util.Arrays;
import java.util.HashMap;

public class Intersecting_array {
    /**Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.



     Example 1:

     Input: nums1 = [1,2,2,1], nums2 = [2,2]
     Output: [2,2]
     Example 2:

     Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
     Output: [4,9]
     Explanation: [9,4] is also accepted.*/
    /**
     Time Complexity: O(n+m), where n and m are the lengths of the arrays. We iterate through the first, and then through the second array; insert and lookup operations in the hash map take a constant time.

     Space Complexity: O(min(n,m)). We use hash map to store numbers (and their counts) from the smaller array.
     */
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length){
            return intersect(nums2,nums1);
        }
        // first array
        HashMap<Integer,Integer> m= new HashMap<>();
        for(int n:nums1){
            m.put(n,m.getOrDefault(n,0)+1);
        }
        int k=0;
        //second array
        for(int n:nums2){
            int count=m.getOrDefault(n,0);
            if(count>0){
                nums1[k++]=n;
                m.put(n,count-1); // if exsist in first array then decease count
            }
        }
        return Arrays.copyOfRange(nums1,0,k);
    }
}
