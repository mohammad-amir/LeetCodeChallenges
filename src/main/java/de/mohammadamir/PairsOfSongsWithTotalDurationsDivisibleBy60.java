package de.mohammadamir;

// Pairs of Songs With Total Durations Divisible by 60
// https://leetcode.com/problems/pairs-of-songs-with-total-durations-divisible-by-60/
public class PairsOfSongsWithTotalDurationsDivisibleBy60 {
    public int numPairsDivisibleBy60(int[] time) {
        int pairs = 0;

        int[] timeCount = new int[61];

        for (int i = 0; i < time.length; i++) {
            int key = time[i] % 60;

            if (timeCount[(60 - key)%60] > 0) {
                pairs += timeCount[(60 - key)%60];
            }

            timeCount[key] = timeCount[key] + 1;
        }

        return pairs;
    }
}
