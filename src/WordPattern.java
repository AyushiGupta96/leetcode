import java.util.HashMap;

public class WordPattern {
    /** Given a pattern and a string s, find if s follows the same pattern.

     Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s. Specifically:

     Each letter in pattern maps to exactly one unique word in s.
     Each unique word in s maps to exactly one letter in pattern.
     No two letters map to the same word, and no two words map to the same letter.


     Example 1:

     Input: pattern = "abba", s = "dog cat cat dog"

     Output: true

     Explanation:

     The bijection can be established as:

     'a' maps to "dog".
     'b' maps to "cat".
     Example 2:

     Input: pattern = "abba", s = "dog cat cat fish"

     Output: false

     Example 3:

     Input: pattern = "aaaa", s = "dog cat cat dog"

     Output: false

*/
    public boolean wordPattern(String pattern, String s) {
        HashMap map = new HashMap();
        String[] words = s.split(" ");
        if(words.length != pattern.length())
            return false;
        for(Integer i=0;i<words.length;i++){
            char c = pattern.charAt(i);
            String w = words[i];
            if(!map.containsKey(c)){
                map.put(c,i);
            }
            if(!map.containsKey(w)){
                map.put(w,i);
            }
            if(map.get(c)!=map.get(w)){
                return false;
            }


        }
        return true;
    }
     }
