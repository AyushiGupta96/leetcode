import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    /**
     Given two strings s and t, determine if they are isomorphic.

     Two strings s and t are isomorphic if the characters in s can be replaced to get t.

     All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.



     Example 1:

     Input: s = "egg", t = "add"

     Output: true

     Explanation:

     The strings s and t can be made identical by:

     Mapping 'e' to 'a'.
     Mapping 'g' to 'd'.
     Example 2:

     Input: s = "foo", t = "bar"

     Output: false

     Explanation:

     The strings s and t can not be made identical as 'o' needs to be mapped to both 'a' and 'r'.
     Time Complexity: O(N). We process each character in both the strings exactly once to determine if they are isomorphic.
     Space Complexity: O(N). We form two new strings returned by our transformation function. The size of ASCII character set is fixed and the keys in our dictionary are valid ASCII characters only. So the size of the map in the transform function doesn't contribute to the space complexity.
     */
    private String transformString(String s){
        Map<Character,Integer> map= new HashMap<>();
        StringBuilder builder = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c1 = s.charAt(i);//converted to character integer
            if(!map.containsKey(c1)){
                map.put(c1,i);
            }
            builder.append(Integer.toString(map.get(c1)));
            builder.append(" ");
        }
        return builder.toString();
    }
    public boolean isIsomorphic(String s, String t) {
        return transformString(s).equals(transformString(t));
    }
}
