import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class DisappearNumber {
    /**Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.



     Example 1:

     Input: nums = [4,3,2,7,8,2,3,1]
     Output: [5,6]
     Example 2:

     Input: nums = [1,1]
     Output: [2]

     Time Complexity : O(N)
     Space Complexity : O(N)
     */
    public List<Integer> findDisappearedNumbers(int[] nums) {
        //hash table for keeping track of the numbers in the array
        //note that we can also a set here since we are not.
        //really concerned with frequency of numbers.
        HashMap<Integer,Boolean> hashTable = new HashMap<Integer,Boolean>();
        //add each of numbers to hashtable
        for(int i=0;i<nums.length;i++){
            hashTable.put(nums[i],true);
        }
        //response array that would contain the missing numbers
        List<Integer> result = new LinkedList<Integer>();
        //iterate over numbers from 1 to N and add all thosethat dont appear in hash table.
        for(int i=1;i<=nums.length;i++){
            if(!hashTable.containsKey(i)){
                result.add(i);
            }
        }
        return result;

    }
}
