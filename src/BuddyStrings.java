public class BuddyStrings {
    /** Given two strings s and goal, return true if you can swap two letters in s so the result is equal to goal, otherwise, return false.

     Swapping letters is defined as taking two indices i and j (0-indexed) such that i != j and swapping the characters at s[i] and s[j].

     For example, swapping at indices 0 and 2 in "abcd" results in "cbad".


     Example 1:

     Input: s = "ab", goal = "ba"
     Output: true
     Explanation: You can swap s[0] = 'a' and s[1] = 'b' to get "ba", which is equal to goal.
     Example 2:

     Input: s = "ab", goal = "ab"
     Output: false
     Explanation: The only letters you can swap are s[0] = 'a' and s[1] = 'b', which results in "ba" != goal.
     Example 3:

     Input: s = "aa", goal = "aa"
     Output: true
     Explanation: You can swap s[0] = 'a' and s[1] = 'a' to get "aa", which is equal to goal.

     First of all, s and goal should have the same length, otherwise, they can never become equal after one swap.

     Now, let's assume we can change the string s into goal after swapping index x and y.
     Thus, it means initially before the swap all the characters except at indices x and y were equal in strings s and goal.

     slide1

     We can iterate over all indices to check if characters at only two indices are different in strings s and goal. If we have one or more than two indices having different characters, then it will never be possible to make both strings equal with exactly one swap.

     After the swap operation, the elements at index x and y should also become equal in both strings, which means:

     in the string s the character at index x was present at index y in string goal, and
     in the string s the character at index y was present at index x in string goal
     slid2

     Now, what if the strings s and goal were initially already the same?

     Say if string s = 'aabcda' and goal = 'aabcda'.
     We have to swap two characters in the string s such that it will remain the same, which can be achieved by performing the swap on two characters that are the same.

     So, if s = goal and string s has at least one character appearing multiple times, then it is possible to swap two characters in s without changing it and keep s = goal.

     If string s = 'abcde' and goal = 'abcde', there is no way we can keep string s the same after performing one swap operation on it because there is no character appearing multiple times.

     Algorithm
     If the number of characters in string s and goal is different then they can never become equal, thus we return false.
     If s == goal:
     We can use a hash map or create an array of size 26 frequency to store the frequency of each character of string s.
     If any character has a frequency of more than 1 then we can swap those two same characters, thus we will return true. Otherwise, we return false.
     Otherwise s != goal. We keep two variables firstIndex and secondIndex both initialized to -1, to store the indices of string s having different characters than string goal at the same index.
     We iterate over each index i in string s:
     If characters at s[i] and goal[i] are not the same, then we store the current index:
     If firstIndex == -1, it means this is the first index with a different character, thus we update firstIndex = i. If firstIndex != -1, but secondIndex == -1, it means this is the second index with a different character, thus we update secondIndex = i.
     But if both firstIndex and secondIndex are not -1, then it means this is the third index with a different character and it is not possible to make both strings equal using only one swap, thus we can return false in this case.
     Check if only firstIndex was updated and secondIndex == -1, i.e. we have only one index with a different character, then we also can't make both strings equal and we return false.
     Now, all characters of both strings are the same except at two indices. So, s[firstIndex] must be equal to goal[secondIndex] and s[secondIndex] must be equal to goal[firstIndex], to make both strings equal after swapping.*/
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()){
            return false;

        }
        if(s.equals(goal)){
//if we have 2 same characters in string 's', we can swap them and still the string will remain equal.
            int[] frequency = new int[26];
            for(char ch : s.toCharArray()){
                frequency[ch - 'a'] += 1;
                if(frequency[ch-'a'] == 2){
                    return true;
                }
            }
//otherwise, if we swap any twocharacters,it will make the string unequal.
            return false;
        }
        int first =-1;
        int second = -1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!= goal.charAt(i)){
                if(first == -1){
                    first =i;
                }
                else if(second == -1){
                    second = i;
                }
                else{
                    // we have at least 3 indices with different characters, thus we can never make the string equal with only one swap.
                    return false;
                }
            }
        }
        if(second == -1){
// we can't swap if the character at only one index is different.
            return false;
        }
        //all charcters of both string are the same except two indices.
        return s.charAt(first) == goal.charAt(second) && s.charAt(second) == goal.charAt(first);
    }
}

