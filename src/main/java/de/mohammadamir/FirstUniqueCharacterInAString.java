package de.mohammadamir;

// First Unique Character in a String
// https://leetcode.com/problems/first-unique-character-in-a-string/
public class FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        if (s != null && s.length() > 0) {
            int[] countArray = new int[26];
            char[] charArray = s.toCharArray();

            for (char c : charArray) {
                countArray[c - 'a']++;
            }

            for (int i=0; i < charArray.length; i++) {
                if (countArray[charArray[i] - 'a'] == 1) {
                    return i;
                }
            }
        }

        return -1;
    }
}
