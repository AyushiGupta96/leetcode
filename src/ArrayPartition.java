public class ArrayPartition {
    /** Given an integer array nums of 2n integers, group these integers into n pairs (a1, b1), (a2, b2), ..., (an, bn) such that the sum of min(ai, bi) for all i is maximized. Return the maximized sum.



     Example 1:

     Input: nums = [1,4,3,2]
     Output: 4
     Explanation: All possible pairings (ignoring the ordering of elements) are:
     1. (1, 4), (2, 3) -> min(1, 4) + min(2, 3) = 1 + 2 = 3
     2. (1, 3), (2, 4) -> min(1, 3) + min(2, 4) = 1 + 2 = 3
     3. (1, 2), (3, 4) -> min(1, 2) + min(3, 4) = 1 + 3 = 4
     So the maximum possible sum is 4.
     Example 2:

     Input: nums = [6,2,6,5,1,2]
     Output: 9
     Explanation: The optimal pairing is (2, 1), (2, 5), (6, 6). min(2, 1) + min(2, 5) + min(6, 6) = 1 + 2 + 6 = 9. */
    final static int k=10000;
    public int arrayPairSum(int[] nums) {
        //Store the frequency of each element.
        int[] count = new int[2*k+1];
        for(int i : nums){
            // add k to element to offset negative values
            count[i + k]++;
        }
        //Initialize sum to zero
        int max=0;
        boolean even = true;
        for(int i=0;i<=2 * k;i++){
            while(count[i]>0){
                // Add element if it is at even position
                max +=(even ? i - k : 0);
                //flip the value (one to zero or zero to one)
                even = !even;
                //decrement the frequency count
                count[i]--;
            }
        }
        return max;
    }
}
