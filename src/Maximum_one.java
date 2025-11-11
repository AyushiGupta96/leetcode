public class Maximum_one {
    public int findMaxConsecutiveOnes(int[] nums) {
        /** Given a binary array nums, return the maximum number of consecutive 1's in the array.



         Example 1:

         Input: nums = [1,1,0,1,1,1]
         Output: 3
         Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
         Example 2:

         Input: nums = [1,0,1,1,0,1]
         Output: 2
         Time Complexity: O(N), where N is the number of elements in the array.

         Space Complexity: O(1). We do not use any extra space.*/
        int count =0;
        int max =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1){
                // increment count of 1's by one.
                count+=1;
            }
            else{
                //find the maximum till now.
                max = Math.max(max,count);
                //Reset count of 1.
                count =0;
            }
        }
        return Math.max(max,count);
    }
}
