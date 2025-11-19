public class IntToChar {
    /** Example 1:

     Input: columnNumber = 1
     Output: "A"
     Example 2:

     Input: columnNumber = 28
     Output: "AB"
     Example 3:

     Input: columnNumber = 701
     Output: "ZY"

     Time complexity: O(logN)

     The number of operations would be equal to the number of while loop iterations. In each iteration, the number N gets divided by 26. Hence the time complexity would be O(log
     26
     ​
     N). Note that the base of the logarithm is not relevant when it comes to big O, since all logarithms are related by a constant factor.

     Space complexity: O(1)

     We only need one string to store the output, but generally the space to store the output is not considered as part of space complexity and hence the space complexity is constant.
     */
    public String convertToTitle(int columnNumber) {
        StringBuilder ans = new StringBuilder();
        while(columnNumber>0){
            columnNumber--;
            //get the last character and append it at the end of string.
            ans.append((char)(((columnNumber)%26)+'A'));
            columnNumber= (columnNumber)/26;
        }
        //Reverse it, as we appended characters in reverse order.
        return ans.reverse().toString();
    }
}
