package de.mohammadamir;

import java.util.ArrayList;
import java.util.List;

// Find All Anagrams in a String
// https://leetcode.com/problems/find-all-anagrams-in-a-string/
public class FindAllAnagramsInAString {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> indices = new ArrayList<>();

        if (s != null && s.length() >= p.length()) {
            char[] charArray = s.toCharArray();
            int[] countArray = getCountArray(p);
            int counter = p.length();
            int maxGap = counter - 1;

            for (int i = 0, j = 0; i < charArray.length; i++) {
                if(countArray[charArray[i] - 'a'] > 0) {
                    counter--;
                }

                countArray[charArray[i] - 'a']--;

                if (counter == 0) {
                    indices.add(j);
                }

                if (i - j == maxGap) {
                    if (countArray[charArray[j] - 'a'] > -1) {
                        counter++;
                    }

                    countArray[charArray[j] - 'a']++;

                    j++;
                }
            }
         }

        return indices;
    }

    private int[] getCountArray(String str) {
        int[] countArray = new int[26];

        for(char ch : str.toCharArray()) {
            countArray[ch - 'a']++;
        }

        return countArray;
    }
}
