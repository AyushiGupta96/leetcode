public class LargestNumberAtLeastTwiceofOthers {
    /** Example 1:

     Input: nums = [3,6,1,0]
     Output: 1
     Explanation: 6 is the largest integer.
     For every other number in the array x, 6 is at least twice as big as x.
     The index of value 6 is 1, so we return 1.
     Example 2:

     Input: nums = [1,2,3,4]
     Output: -1
     Explanation: 4 is less than twice the value of 3, so we return -1.
     Time Complexity: O(N) where N is the length of nums.

     Space Complexity: O(1), the space used by our int variables.*/
    public int dominantIndex(int[] nums) {
        int maxIndex=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[maxIndex]){
                maxIndex = i;
            }}
        for(int i=0;i<nums.length;i++){
            if(maxIndex !=i &&nums[maxIndex] < 2* nums[i])
                return -1;
        }
        return maxIndex;
    }
}
