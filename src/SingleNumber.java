import java.util.HashMap;

public class SingleNumber {
/**Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

 You must implement a solution with a linear runtime complexity and use only constant extra space.



 Example 1:

 Input: nums = [2,2,1]

 Output: 1

 Example 2:

 Input: nums = [4,1,2,1,2]

 Output: 4

 Example 3:

 Input: nums = [1]

 Output: 1

 Time complexity : O(n⋅1)=O(n). Time complexity of for loop is O(n). Time complexity of hash table(dictionary in python) operation pop is O(1).

 Space complexity : O(n). The space required by hash_table is equal to the number of elements in nums. */

    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i:nums){
            if(map.get(i)==1){
                return i;
            }

        }
        return 0;
    }
}
