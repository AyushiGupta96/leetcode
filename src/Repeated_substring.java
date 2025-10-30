public class Repeated_substring {
    /** Given a string s, check if it can be constructed by taking a substring of it and appending multiple copies of the substring together.



     Example 1:

     Input: s = "abab"
     Output: true
     Explanation: It is the substring "ab" twice.
     Example 2:

     Input: s = "aba"
     Output: false
     Example 3:

     Input: s = "abcabcabcabc"
     Output: true
     Explanation: It is the substring "abc" four times or the substring "abcabc" twice

     Algorithm
     Create an integer variable n equal to the length of s.
     Iterate over all the prefix substrings of length i = 1 to n / 2:
     If i divides n, we declare an empty string pattern. Use an inner loop that iterates n / i times to concatenate the substring formed from the first i characters of s.
     If pattern equals s, we return true.
     There is no substring that can be repeated to form s. As a result, we return false

     Time complexity: O(n⋅
     n
     ​
     ).

     A number n can have a maximum of 2⋅
     n

     number of divisors. As a result, we would execute the inner loop that concatenates the substring O(
     n

     ) times. In the inner loop, we concatenate a substring of length i for n / i times to generate a string of length n, which would require O(n) time for each iteration. As a result, it would take O(n⋅
     n

     ) in total.
     Space complexity: O(n).

     We used another string variable, pattern, which is initialized to an empty string before the inner loop iteration and grows up to a length of n after the inner loop iteration.


     */
    public boolean repeatedSubstringPattern(String s) {
        int n= s.length();
        for(int i=1;i<=n/2;i++){
            if(n % i==0){
                StringBuilder string = new StringBuilder();
                for(int j=0;j<n/i;j++){
                    string.append(s.substring(0,i));
                }
                if(s.equals(string.toString())){
                    return true;
                }
            }
        }
        return false;
    }
}
