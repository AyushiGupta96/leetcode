import java.util.HashMap;

public class Unique_character {
    /** Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.



     Example 1:

     Input: s = "leetcode"

     Output: 0

     Explanation:

     The character 'l' at index 0 is the first character that does not occur at any other index.

     Example 2:

     Input: s = "loveleetcode"

     Output: 2

     Example 3:

     Input: s = "aabb"

     Output: -1
     Time complexity: O(N) since we go through the string of length N two times.
     Space complexity: O(1) because English alphabet contains 26 letters.*/
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        int n = s.length();
        //build hashmap andhow charcter appears
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        //find the index
        for(int i=0;i<n;i++){
            if(map.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}
