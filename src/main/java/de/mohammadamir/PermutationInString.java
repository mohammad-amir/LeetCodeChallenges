package de.mohammadamir;

// Permutation in String
// https://leetcode.com/problems/permutation-in-string/
public class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.equals(s2)) {
            return true;
        }

        int length = s1.length();
        char[] s2Chars = s2.toCharArray();
        int[] countArray = new int[26];

        for (char ch : s1.toCharArray()) {
            countArray[ch - 'a']++;
        }

        int counter = length;
        int i = 0;
        int j = 0;
        while(i < s2Chars.length) {
            if (countArray[s2Chars[i++] - 'a']-- > 0) {
                counter--;
            }

            if (counter == 0) {
                return true;
            }

            if (i - j == length && countArray[s2Chars[j++] - 'a']++ > -1) {
                counter++;
            }
        }

        return false;
    }
}
