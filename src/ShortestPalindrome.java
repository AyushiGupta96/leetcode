public class ShortestPalindrome {
    /** You are given a string s. You can convert s to a palindrome by adding characters in front of it.

     Return the shortest palindrome you can find by performing this transformation.

     Example 1:

     Input: s = "aacecaaa"
     Output: "aaacecaaa"
     Example 2:

     Input: s = "abcd"
     Output: "dcbabcd"
     Space complexity: O(n)

     Time complexity: O(n
     2
     )*/
     public String shortestPalindrome(String s) {
     int length = s.length();
     String reverseString = new StringBuilder(s).reverse().toString();
     //Iterate through the string to find the longest palindromic prefix
     for(int i=0; i < length ; i++){
     if(s.substring(0,length - i).equals(reverseString.substring(i)))
     {
     return new StringBuilder(reverseString.substring(0,i)).append(s).toString();
     }
     }
     return "";
     }
     }
