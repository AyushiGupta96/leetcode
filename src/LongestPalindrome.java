import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {
    /**  Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.

     Letters are case sensitive, for example, "Aa" is not considered a palindrome.



     Example 1:

     Input: s = "abccccdd"
     Output: 7
     Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.
     Example 2:

     Input: s = "a"
     Output: 1
     Explanation: The longest palindrome that can be built is "a", whose length is 1.

     Algorithm
     Initialize a map frequencyMap to store the frequency of each character.
     Count the frequency of each character in s.
     Initialize variables:
     res to store the length of the longest palindrome.
     hasOddFrequency flag to check whether a character with odd frequency exists.
     Loop through the frequencies freq of each character:
     If freq is even, add it to res.
     If the freq is odd, add freq-1 to res and set hasOddFrequency to true.
     If hasOddFrequency is true, return res+1, otherwise, return res.


     Time complexity: O(n)

     The algorithm goes through the characters of s twice: once to count their frequencies and once to construct the palindrome. Since hash table operations like inserting and updating take constant time (O(1)), the time complexity of the algorithm is O(2⋅n), which simplifies to O(n).

     Space complexity: O(1)

     The algorithm uses a hash table to store the frequency of characters. Given that there can be at most 52 unique characters in s, the space complexity is O(52), which can be simplified to O(1) space.*/
    public int longestPalindrome(String s) {
        //map to store frequency of occurrence of each character
        Map<Character,Integer> map = new HashMap<>();
        //count frequencies
        for( char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int res = 0;
        boolean odd = false;
        for(int f :map.values()){
            // check is frequency is even
            if((f%2)==0){
                res = res+f;
            }
            else{
                // if frequency is odd , one occurrence of the character will remain without a match
                res = res+f-1;
                odd = true;
            }
        }
        // if odd frequency is true, we have at least one unmatched
        //character to make the center of an odd palindrome.
        if(odd)
            return res+1;
        return res;
    }
}
