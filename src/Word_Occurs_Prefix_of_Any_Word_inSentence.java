public class Word_Occurs_Prefix_of_Any_Word_inSentence {
    /**
     * Given a sentence that consists of some words separated by a single space, and a searchWord, check if searchWord is a prefix of any word in sentence.
     * <p>
     * Return the index of the word in sentence (1-indexed) where searchWord is a prefix of this word. If searchWord is a prefix of more than one word, return the index of the first word (minimum index). If there is no such word return -1.
     * <p>
     * A prefix of a string s is any leading contiguous substring of s.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: sentence = "i love eating burger", searchWord = "burg"
     * Output: 4
     * Explanation: "burg" is prefix of "burger" which is the 4th word in the sentence.
     * Example 2:
     * <p>
     * Input: sentence = "this problem is an easy problem", searchWord = "pro"
     * Output: 2
     * Explanation: "pro" is prefix of "problem" which is the 2nd and the 6th word in the sentence, but we return 2 as it's the minimal index.
     * Example 3:
     * <p>
     * Input: sentence = "i am tired", searchWord = "you"
     * Output: -1
     * Explanation: "you" is not a prefix of any word in the sentence
     * <p>
     * <p>
     * Time complexity: O(n+w⋅m)
     * <p>
     * The algorithm first splits the sentence into individual words using built-in functions. This process involves iterating through all n characters of the string once, resulting in a time complexity of O(n).
     * <p>
     * Next, for each word extracted from the sentence, the algorithm compares the first m characters of the word with the searchWord. This comparison is done using a built-in function that checks the prefix of length m, which takes O(m) time per word. Since there are w words in the sentence, this part of the algorithm takes O(w⋅m) time.
     * <p>
     * Combining both parts, the total time complexity of the algorithm is O(n+w⋅m).
     * <p>
     * Space complexity: O(n)
     * <p>
     * The algorithm uses built-in functions that process the input sentence directly, requiring O(n) space to store the sentence string. The currentWord variable temporarily holds one word at a time, requiring O(k) space, but this space is reused across iterations. Additionally, the algorithm uses constant space O(1) for variables like wordPosition. Therefore, the overall space complexity is O(n).
     */
    public int isPrefixOfWord(String sentence, String searchWord) {
        //split sentence into words
        String[] words = sentence.split(" ");
        //iterate over the words with their position
        for (int i = 0; i < words.length; i++) {
            //check if the current word is long enough to contain the searchword as a prefix
            //and if the prefix matches the searchword
            if (words[i].length() >= searchWord.length() && words[i].substring(0, searchWord.length()).equals(searchWord)) {
                // If a match is found, return the current word position (adjusted to 1-based index)
                return i + 1;
            }
        }
        //if no match is found , return -1
        return -1;
    }

}
