public class Reverse_Character_without_reversing_sentence {
    /**Algorithm

     The variable lastSpaceIndex stores the index of space character last found. Initialize its value to -1.

     Traverse over each character of the string from 0
     th
     index to n
     th
     index using pointer strIndex.

     As strIndex points to a space character, mark the start and end index of the current word in the variables startIndex and endIndex as,

     The startIndex of the current word is the value of lastSpaceIndex + 1.
     The endIndex of the current word is the value of strIndex - 1.
     Reverse the characters in the current word using two pointer approach.

     Update the lastSpaceIndex to the value of strIndex i.e the index of current space character. The next iteration will refer to this variable to identify the start position of the next word.

     Repeat the process for all the words in the string.


     Time Complexity: O(N) The outer loop iterates over N characters to find the start and end index of every word. The algorithm to reverse the word also iterates N times to perform N/2 swaps. Thus, the time complexity is O(N+N)=O(N).

     Space Complexity: O(1) We use constant extra space to track the last space index. You could also argue that we are using O(n) space to build the output string (we normally don't count the output as part of the space complexity, but in this case we are temporarily using some space to build it). */
    public String reverseWords(String s) {
        int last =-1;
        char[] c = s.toCharArray();
        int len = s.length();
        for(int i=0;i<=len;i++){
            if(i==len || c[i] == ' '){
                int start = last+1;
                int end = i-1;
                while(start<end){
                    char temp = c[start];
                    c[start]=c[end];
                    c[end]= temp;
                    start++;
                    end--;
                }
                last = i;
            }
        }
        return new String(c);
    }
}
