public class ReverseK {
    /**
     * Given a string s and an integer k, reverse the first k characters for every 2k characters counting from the start of the string.
     * <p>
     * If there are fewer than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and leave the other as original.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: s = "abcdefg", k = 2
     * Output: "bacdfeg"
     * Example 2:
     * <p>
     * Input: s = "abcd", k = 2
     * Output: "bacd"
     * <p>
     * Time Complexity: O(N), where N is the size of s. We build a helper array, plus reverse about half the characters in s.
     * <p>
     * Space Complexity: O(N), the size of a.
     */
    public String reverseStr(String s, int k) {


        char[] a = s.toCharArray();
        for (int start = 0; start < a.length; start += 2 * k) {
            int i = start, j = Math.min(start + k - 1, a.length - 1);
            while (i < j) {
                char t = a[i];
                a[i++] = a[j];
                a[j--] = t;
            }
        }
        return new String(a);
    }
}