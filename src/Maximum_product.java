import java.util.Arrays;

public class Maximum_product {
    /** Given an integer array nums, find three numbers whose product is maximum and return the maximum product.



     Example 1:

     Input: nums = [1,2,3]
     Output: 6
     Example 2:

     Input: nums = [1,2,3,4]
     Output: 24
     Example 3:

     Input: nums = [-1,-2,-3]
     Output: -6
     Time complexity : O(nlogn). Sorting the nums array takes nlogn time.

     Space complexity : O(logn). Sorting takes O(logn) space.
*/
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        return Math.max(nums[0]*nums[1]*nums[nums.length-1],nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3]);
    }
     }
