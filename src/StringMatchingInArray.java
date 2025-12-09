import java.util.ArrayList;
import java.util.List;

public class StringMatchingInArray {
    /** Given an array of string words, return all strings in words that are a substring of another word. You can return the answer in any order.



     Example 1:

     Input: words = ["mass","as","hero","superhero"]
     Output: ["as","hero"]
     Explanation: "as" is substring of "mass" and "hero" is substring of "superhero".
     ["hero","as"] is also a valid answer.
     Example 2:

     Input: words = ["leetcode","et","code"]
     Output: ["et","code"]
     Explanation: "et", "code" are substring of "leetcode".
     Example 3:

     Input: words = ["blue","green","bu"]
     Output: []
     Explanation: No string of words is substring of another string.

     Time complexity: O(m
     2
     ×n
     2
     )

     The isSubstringOf function iterates through all possible starting indices of the main string to check whether each index is a valid starting point for the sub string. This is done using a nested loop that examines each character in the sub string. Therefore, the isSubstringOf function has a time complexity of O(m
     2
     ).

     In the stringMatching function, we call isSubstringOf for every pair of strings within the words array. This results in O(n
     2
     ) calls to isSubstringOf. Thus, the overall time complexity of the algorithm is O(m
     2
     ×n
     2
     ).

     The Python implementation, which uses the optimized built-in operation for substring checks, has a time complexity of O(m×n
     2
     ), as the built-in operation performs more efficiently than the naive approach.

     Space complexity: O(1)

     We create a string array, matchingWords, to store the strings that are identified as substrings of other words. In the worst case, this array may need to store all the strings from the words array, meaning it could grow to a size of O(m×n). Beyond this, the algorithm only uses a fixed number of variables (subFits, currentWordIndex), which contribute O(1) auxiliary space. Therefore, the auxiliary space complexity—the extra space used during execution excluding input and output—is O(1).*/
    class Solution {
        public List<String> stringMatching(String[] words) {
            List<String> word = new ArrayList<>();
            //Iterate through each word in the input array.
            for(int i =0; i<words.length;i++){
                //compare the current word with all otherwords.
                for(int j=0;j<words.length;j++){
                    if(i==j)
                        continue;//skip comparing the owrd with itself.
                    //check of the current word is a substring of another word.
                    if(isSubstringOf(words[i],words[j])){
                        word.add(words[i]);//Add it to the result list if true.
                        break;
                    }
                }
            }
            return word;
        }
        // helper function to check if sub is a substring of main .
        private boolean isSubstringOf(String sub,String main){
            //Loop through possible starting indices in main .
            for(int start=0;start <main.length();start++){
                boolean subFits = true;
                //check if the substring matches from current start index.
                for(int subIndex = 0;subIndex < sub.length();subIndex++){
                    if(start + subIndex >= main.length() || main.charAt(start + subIndex)!= sub.charAt(subIndex)){
                        subFits = false;// The sunstring doesn't match.
                        break;//No need to coninue further for thsi start index.

                    }
                }
                if(subFits){
                    return true;
                }
            }
            return false;
        }
    }
}
