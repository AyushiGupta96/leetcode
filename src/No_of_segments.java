public class No_of_segments {
    /**Given a string s, return the number of segments in the string.

     A segment is defined to be a contiguous sequence of non-space characters.



     Example 1:

     Input: s = "Hello, my name is John"
     Output: 5
     Explanation: The five segments are ["Hello,", "my", "name", "is", "John"]
     Example 2:

     Input: s = "Hello"
     Output: 1


     Constraints:

     0 <= s.length <= 300
     s consists of lowercase and uppercase English letters, digits, or one of the following characters "!@#$%^&*()_+-=',.:".
     The only space character in s is ' '.

     Time complexity : O(n)

     We do a constant time check for each of the string's n indices, so the
     runtime is overall linear.

     Space complexity : O(1)

     There are only a few integers allocated, so the memory footprint is
     constant.*/
    public int countSegments(String s) {
        int count =0;
        for(int i=0;i<s.length();i++){
            if((i==0 || s.charAt(i-1)==' ')&& s.charAt(i)!=' '){
                count ++;
            }
        }
        return count;
    }
}
