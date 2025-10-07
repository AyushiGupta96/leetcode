public class duplicate {
    /**
     * Example 1:
     *
     * Input: nums = [1,2,3,1]
     *
     * Output: true
     *
     * Explanation:
     *
     * The element 1 occurs at the indices 0 and 3.
     *
     * Example 2:
     *
     * Input: nums = [1,2,3,4]
     *
     * Output: false
     *
     * Explanation:
     *
     * All elements are distinct.
     *
     * Example 3:
     *
     * Input: nums = [1,1,1,3,3,4,3,2,4,2]
     *
     * Output: true
     * Time complexity: O(n
     * 2
     *  ). In the worst case, there are
     * 2
     * n(n−1)
     * ​
     *   pairs of integers to check. Therefore, the time complexity is O(n
     * 2
     *  ).
     *
     * Space complexity: O(1).
     * We only used constant extra space
     * */
    public boolean containsDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
