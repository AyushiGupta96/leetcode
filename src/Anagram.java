import java.util.HashMap;

public class Anagram {
    /**
     * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
     *
     *
     *
     * Example 1:
     *
     * Input: s = "anagram", t = "nagaram"
     *
     * Output: true
     *
     * Example 2:
     *
     * Input: s = "rat", t = "car"
     *
     * Output: false */

    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> m = new HashMap<>();
        int sl = s.length();
        int tl = t.length();
        if (sl != tl) {
            return false;
        }
        for (int i = 0; i < sl; i++) {
            m.put(s.charAt(i), m.getOrDefault(s.charAt(i), 0) + 1);
            m.put(t.charAt(i), m.getOrDefault(t.charAt(i), 0) - 1);
        }
        for (char c : m.keySet()) {
            if (m.get(c) != 0) {
                return false;
            }
        }

        return true;
    }
}