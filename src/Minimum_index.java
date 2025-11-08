import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Minimum_index {
    /**Given two arrays of strings list1 and list2, find the common strings with the least index sum.

     A common string is a string that appeared in both list1 and list2.

     A common string with the least index sum is a common string such that if it appeared at list1[i] and list2[j] then i + j should be the minimum value among all the other common strings.

     Return all the common strings with the least index sum. Return the answer in any order.



     Example 1:

     Input: list1 = ["Shogun","Tapioca Express","Burger King","KFC"], list2 = ["Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"]
     Output: ["Shogun"]
     Explanation: The only common string is "Shogun".
     Example 2:

     Input: list1 = ["Shogun","Tapioca Express","Burger King","KFC"], list2 = ["KFC","Shogun","Burger King"]
     Output: ["Shogun"]
     Explanation: The common string with the least index sum is "Shogun" with index sum = (0 + 1) = 1.
     Example 3:

     Input: list1 = ["happy","sad","good"], list2 = ["sad","happy","good"]
     Output: ["sad","happy"]
     Explanation: There are three common strings:
     "happy" with index sum = (0 + 1) = 1.
     "sad" with index sum = (1 + 0) = 1.
     "good" with index sum = (2 + 2) = 4.
     The strings with the least index sum are "sad" and "happy".
     Time complexity : O(l
     1
     ​
     +l
     2
     ​
     ). Every item of list2 is checked in a map of list1. l
     1
     ​
     and l
     2
     ​
     are the lengths of list1 and list2 respectively.

     Space complexity : O(l
     1
     ​
     ∗x). hashmap size grows upto l
     1
     ​
     ∗x, where x refers to average string length. */
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        for(int i=0;i<list1.length;i++){
            map.put(list1[i],i);
        }
        List<String> res = new ArrayList<>();
        int min = Integer.MAX_VALUE, sum;
        for(int j=0;j<list2.length && j<=min;j++){
            if(map.containsKey(list2[j])){
                sum = j + map.get(list2[j]);
                if(sum<min){
                    res.clear();
                    res.add(list2[j]);
                    min = sum;
                }else if(sum == min)
                    res.add(list2[j]);
            }
        }
        return res.toArray(new String[res.size()]);
    }
}
