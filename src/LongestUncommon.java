public class LongestUncommon {
/** Given two strings a and b, return the length of the longest uncommon subsequence between a and b. If no such uncommon subsequence exists, return -1.

 An uncommon subsequence between two strings is a string that is a subsequence of exactly one of them.



 Example 1:

 Input: a = "aba", b = "cdc"
 Output: 3
 Explanation: One longest uncommon subsequence is "aba" because "aba" is a subsequence of "aba" but not "cdc".
 Note that "cdc" is also a longest uncommon subsequence.
 Example 2:

 Input: a = "aaa", b = "bbb"
 Output: 3
 Explanation: The longest uncommon subsequences are "aaa" and "bbb".
 Example 3:

 Input: a = "aaa", b = "aaa"
 Output: -1
 Explanation: Every subsequence of string a is also a subsequence of string b. Similarly, every subsequence of string b is also a subsequence of string a. So the answer would be -1.
 Time complexity: O(n)

 In the worst case, string comparison will take O(n).

 In the best case, string comparison can take O(1). Some languages, including Java, optimize string comparison and can determine immediately that the strings are not the same if they are not the same length. For these languages, it still takes O(n) in the worst case when the strings are the same.

 Space complexity:

 O(1) because we do not use data structures that require additional space.

*/
public int findLUSlength(String a, String b) {
    if(a.equals(b)) {
        return -1;
    }
    else{
        return Math.max(a.length(),b.length());
    }
}
 }
