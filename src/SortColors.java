public class SortColors {
    /**
     * Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
     *
     * We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
     *
     * You must solve this problem without using the library's sort function.
     *
     *
     *
     * Example 1:
     *
     * Input: nums = [2,0,2,1,1,0]
     * Output: [0,0,1,1,2,2]
     * Example 2:
     *
     * Input: nums = [2,0,1]
     * Output: [0,1,2]
     * The idea of a solution is to move curr pointer along the array, if nums[curr] = 0 - swap it with nums[p0], if nums[curr] = 2 - swap it with nums[p2].
     *
     * Algorithm
     *
     * Initialise the rightmost boundary of zeros: p0 = 0. During the algorithm execution nums[idx < p0] = 0.
     *
     * Initialise the leftmost boundary of twos: p2 = n - 1. During the algorithm execution nums[idx > p2] = 2.
     *
     * Initialise the index of the current element to consider: curr = 0.
     *
     * While curr <= p2 :
     *
     * If nums[curr] = 0: swap currth and p0th elements and move both pointers to the right.
     *
     * If nums[curr] = 2: swap currth and p2th elements. Move pointer p2 to the left.
     *
     * If nums[curr] = 1: move pointer curr to the right*/
    public void sortColors(int[] nums) {
        int p0 = 0,curr =0;
        //for all id >k : nums[id > k] = 2
        int p2 = nums.length -1;
        int temp;
        while(curr <= p2){
            if(nums[curr] == 0){
                //swap p0 and curr element
                //i++ j++
                temp = nums[p0];
                nums[p0++] = nums[curr];
                nums[curr++] = temp;

            }
            else if(nums[curr] == 2){
                // swap k and curr element
                //p2--
                temp = nums[curr];
                nums[curr] = nums[p2];
                nums[p2--] = temp;
            }
            else {
                curr++;
            }
        }
    }
}
