public class CountandSay {
    /** The count-and-say sequence is a sequence of digit strings defined by the recursive formula:

     countAndSay(1) = "1"
     countAndSay(n) is the run-length encoding of countAndSay(n - 1).
     Run-length encoding (RLE) is a string compression method that works by replacing consecutive identical characters (repeated 2 or more times) with the concatenation of the character and the number marking the count of the characters (length of the run). For example, to compress the string "3322251" we replace "33" with "23", replace "222" with "32", replace "5" with "15" and replace "1" with "11". Thus the compressed string becomes "23321511".

     Given a positive integer n, return the nth element of the count-and-say sequence.



     Example 1:

     Input: n = 4

     Output: "1211"

     Explanation:

     countAndSay(1) = "1"
     countAndSay(2) = RLE of "1" = "11"
     countAndSay(3) = RLE of "11" = "21"
     countAndSay(4) = RLE of "21" = "1211"
     Example 2:

     Input: n = 1

     Output: "1"

     Explanation:

     This is the base case.

     Start with the initial string s="1". n−1 times do s=f(s), where
     f(s) denotes the result of saying a digit string s. After this
     process, s will be the answer to the problem.

     To find f(s), one needs to split s into substrings of
     equal digits.

     Algorithm
     The algorithm of "saying" s is the following.

     Start at position j=0 (all indices are 0-based).
     Let k be the leftmost position to the right of j that
     s
     k
     ​

     
     =s
     j
     ​
     if it exists, and ∣s∣ otherwise (∣s∣ denotes the length of s).
     All digits of s between j inclusively and k exclusively are
     equal. The number of these digits is k−j. Add to the result the
     string representation of k−j and the element s
     j
     ​
     .
     Assign j←k.
     If j<∣s∣ go to 2.
     Stop.
 */
    public String countAndSay(int n) {
        String curr = "1";
        for(int i=2;i<=n;i++){
            String next = "";
            for(int j = 0, k = 0;j <curr.length() ; j = k){
                while( k < curr.length() && curr.charAt(k) == curr.charAt(j)){
                    k++;
                    next += Integer.toString(k -j) + curr.charAt(j);
                }

            }
            curr = next;
        }
        return curr;
    }
     }
