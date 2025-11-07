import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    /**You are given a sorted unique integer array nums.

     A range [a,b] is the set of all integers from a to b (inclusive).

     Return the smallest sorted list of ranges that cover all the numbers in the array exactly. That is, each element of nums is covered by exactly one of the ranges, and there is no integer x such that x is in one of the ranges but not in nums.

     Each range [a,b] in the list should be output as:

     "a->b" if a != b
     "a" if a == b


     Example 1:

     Input: nums = [0,1,2,4,5,7]
     Output: ["0->2","4->5","7"]
     Explanation: The ranges are:
     [0,2] --> "0->2"
     [4,5] --> "4->5"
     [7,7] --> "7"
     Example 2:

     Input: nums = [0,2,3,4,6,8,9]
     Output: ["0","2->4","6","8->9"]
     Explanation: The ranges are:
     [0,0] --> "0"
     [2,4] --> "2->4"
     [6,6] --> "6"
     [8,9] --> "8->9"
     Time complexity: O(n).

     We iterate over each nums element once, either including it in the current range or creating a new range from it, which takes O(n) time for n elements.
     We also add all of the ranges to the ranges list. In the worst-case situation, n elements could be added to the list if each consecutive element in nums differs by more than 1, requiring O(n) time to insert all the required ranges.
     Space complexity: O(1).

     Except for a few integer variables like i and start that use constant space, we do not consume any space (if we ignore the space consumed by the input and output).
 */
     public List<String> summaryRanges(int[] nums) {
        List<String> ranges = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int start = nums[i];
            //keep iterating until the next element is one more than current element.
            while (i + 1 < nums.length && nums[i] + 1 == nums[i + 1]) {
                i++;
            }
            if (start != nums[i]) {
                ranges.add(start + "->" + nums[i]);

            } else {
                ranges.add(String.valueOf(start));
            }
        }
        return ranges;
    }
}