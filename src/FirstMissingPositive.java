/**Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.

 You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.



 Example 1:

 Input: nums = [1,2,0]
 Output: 3
 Explanation: The numbers in the range [1,2] are all in the array.
 Example 2:

 Input: nums = [3,4,-1,1]
 Output: 2
 Explanation: 1 is in the array but 2 is missing.
 Example 3:

 Input: nums = [7,8,9,11,12]
 Output: 1
 Explanation: The smallest positive integer 1 is missing.


 Constraints:

 1 <= nums.length <= 105
 -231 <= nums[i] <= 231 - 1  */
public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        boolean[] seen = new boolean[n+1];
        //mark the element from nums in the lookup array
        for(int i: nums){
            if (i > 0 && i<=n){
                seen[i] = true;
            }
        }
        //iterate through integer 1 to n
        //return smallest missing positive integer
        for(int i=1;i<=n;i++){
            if(!seen[i]){
                return i;
            }
        }
        // if seen contains all elements 1 to n
        // the samllest missing positive number is n+1
        return n+1;

    }
}
