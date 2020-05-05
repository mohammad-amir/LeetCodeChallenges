package de.mohammadamir;

// Ransome Note
// https://leetcode.com/problems/ransom-note/
public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote == null || magazine == null) {
            return false;
        }

        int[] countArray = new int[26];

        for(char magazineChar : magazine.toCharArray()) {
            int index = magazineChar - 'a';
            countArray[index] = countArray[index] + 1;
        }

        for(char ransomNoteChar : ransomNote.toCharArray()) {
            int index = ransomNoteChar - 'a';
            if (countArray[index] > 0) {
                countArray[index] = countArray[index] - 1;
            } else {
                return false;
            }
        }

        return true;
    }
}
