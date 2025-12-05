import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class MostCommonWord {
/** Given a string paragraph and a string array of the banned words banned, return the most frequent word that is not banned. It is guaranteed there is at least one word that is not banned, and that the answer is unique.

 The words in paragraph are case-insensitive and the answer should be returned in lowercase.

 Note that words can not contain punctuation symbols.



 Example 1:

 Input: paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.", banned = ["hit"]
 Output: "ball"
 Explanation:
 "hit" occurs 3 times, but it is a banned word.
 "ball" occurs twice (and no other word does), so it is the most frequent non-banned word in the paragraph.
 Note that words in the paragraph are not case sensitive,
 that punctuation is ignored (even if adjacent to words, such as "ball,"),
 and that "hit" isn't the answer even though it occurs more because it is banned.
 Example 2:

 Input: paragraph = "a.", banned = []
 Output: "a"


 */
public String mostCommonWord(String paragraph, String[] banned) {
    Set<String> s = new HashSet<>();
    HashMap<String,Integer> h = new HashMap<>();
    for(String i : banned){
        s.add(i);

    }
    paragraph = paragraph.toLowerCase().replaceAll("[^a-zA-Z]"," ");
    String[] words = paragraph.split(" ");
    for(int j=0;j<words.length;j++){
        String t = words[j];
        if(t.isEmpty() || s.contains(t)){
            continue;

        }
        h.put(t,h.getOrDefault(t,0)+1);
    }
    int max =0;
    String maxWord = "";
    for(String k : h.keySet()){
        if(max<h.get(k)){
            max = h.get(k);
            maxWord = k;
        }
    }
    return maxWord;
}
}
