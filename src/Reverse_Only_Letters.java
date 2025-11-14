public class Reverse_Only_Letters {
/** Given a string s, reverse the string according to the following rules:

 All the characters that are not English letters remain in the same position.
 All the English letters (lowercase or uppercase) should be reversed.
 Return s after reversing it.



 Example 1:

 Input: s = "ab-cd"
 Output: "dc-ba"
 Example 2:

 Input: s = "a-bC-dEf-ghIj"
 Output: "j-Ih-gfE-dCba"
 Example 3:

 Input: s = "Test1ng-Leet=code-Q!"
 Output: "Qedo1ct-eeLg=ntse-T!"


 Time Complexity: O(N), where N is the length of S.

 Space Complexity: O(N).

*/

public String reverseOnlyLetters(String s) {
    char[] c = s.toCharArray();
    StringBuilder sb = new StringBuilder();
    int l=0;
    int r= c.length-1;
    while(l<c.length || r>=0){
        if(l<c.length &&!Character.isLetter(c[l])){
            sb.append(c[l]);
            l++;
        }
        else{
            if(r>=0 && Character.isLetter(c[r])){
                sb.append(c[r]);
                l++;
                //r--;
            }
            r--;

        }
    }
    return sb.toString();
}
/**
 *
 * OR
 * public String reverseOnlyLetters(String S) {
 Stack<Character> letters = new Stack();
 for (char c: S.toCharArray())
 if (Character.isLetter(c))
 letters.push(c);

 StringBuilder ans = new StringBuilder();
 for (char c: S.toCharArray()) {
 if (Character.isLetter(c))
 ans.append(letters.pop());
 else
 ans.append(c);
 }

 return ans.toString();
 }*/
 }
