public class Add_String {
    /**
     * Example 1:
     *
     * Input: num1 = "11", num2 = "123"
     * Output: "134"
     * Example 2:
     *
     * Input: num1 = "456", num2 = "77"
     * Output: "533"
     * Example 3:
     *
     * Input: num1 = "0", num2 = "0"
     * Output: "0"
     * Algorithm
     *
     * Initialize an empty res structure. Once could use array in Python and StringBuilder in Java.
     *
     * Start from carry = 0.
     *
     * Set a pointer at the end of each string: p1 = num1.length() - 1, p2 = num2.length() - 1.
     *
     * Loop over the strings from the end to the beginning using p1 and p2. Stop when both strings are used entirely.
     *
     * Set x1 to be equal to a digit from string nums1 at index p1. If p1 has reached the beginning of nums1, set x1 to 0.
     *
     * Do the same for x2. Set x2 to be equal to digit from string nums2 at index p2. If p2 has reached the beginning of nums2, set x2 to 0.
     *
     * Compute the current value: value = (x1 + x2 + carry) % 10, and update the carry: carry = (x1 + x2 + carry) / 10.
     *
     * Append the current value to the result: res.append(value).
     *
     * Now both strings are done. If the carry is still non-zero, update the result: res.append(carry).
     *
     * Reverse the result, convert it to a string, and return that string
     * Time Complexity: O(max(N
     * 1
     * ​
     *  ,N
     * 2
     * ​
     *  )), where N
     * 1
     * ​
     *   and N
     * 2
     * ​
     *   are length of nums1 and nums2. Here we do max(N
     * 1
     * ​
     *  ,N
     * 2
     * ​
     *  ) iterations at most.
     *
     * Space Complexity: O(max(N
     * 1
     * ​
     *  ,N
     * 2
     * ​
     *  )), because the length of the new string is at most max(N
     * 1
     * ​
     *  ,N
     * 2
     * ​
     *  )+1. */
    public String addStrings(String num1, String num2) {
        StringBuilder res = new StringBuilder();
        int carry =0;
        int n1=num1.length()-1;
        int n2 = num2.length()-1;
        while(n1>=0 || n2>=0){
            int  m1= n1>=0 ? num1.charAt(n1)-'0' :0;
            int m2 = n2>=0 ? num2.charAt(n2)-'0':0;
            int value = (m1+m2+carry)%10;
            carry =(m1+m2+carry)/10;
            res.append(value);
            n1--;n2--;
        }
        if (carry!=0){
            res.append(carry);
        }


        return res.reverse().toString();
    }
}
