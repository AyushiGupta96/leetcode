import java.util.ArrayList;
import java.util.List;

public class NumbersSmallerThanCurrentNumber {
    /**Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].

     Return the answer in an array.



     Example 1:

     Input: nums = [8,1,2,2,3]
     Output: [4,0,1,1,3]
     Explanation:
     For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3).
     For nums[1]=1 does not exist any smaller number than it.
     For nums[2]=2 there exist one smaller number than it (1).
     For nums[3]=2 there exist one smaller number than it (1).
     For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).
     Example 2:

     Input: nums = [6,5,4,8]
     Output: [2,1,0,3]
     Example 3:

     Input: nums = [7,7,7,7]
     Output: [0,0,0,0]

     Approach
     The brute-force approach loops through the array for each element and counts how many values are less than it.
     We can use a nested loop: for each nums[i], we iterate through all elements nums[j] and increment a counter when nums[j] is smaller.
     We store this count for each index and return the resulting array.

     Complexity
     Time complexity:
     Since we compare each pair of elements using nested loops, the time complexity is

     𝑂(𝑛2)

     Space complexity:
     Apart from the output array, we use only a small list to store intermediate values, so the space complexity is

     𝑂(𝑛)*/
    public int[] smallerNumbersThanCurrent(int[] nums) {
        List<Integer> l = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    count++;
                }
            }
            l.add(count);
        }
        for(int i=0;i<nums.length;i++){
            nums[i] = l.get(i);
        }
        return nums;
    }
}
