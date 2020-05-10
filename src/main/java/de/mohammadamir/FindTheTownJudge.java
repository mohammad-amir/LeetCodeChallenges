package de.mohammadamir;

// Find the Town Judge
// https://leetcode.com/problems/find-the-town-judge/
public class FindTheTownJudge {
    public int findJudge(int N, int[][] trust) {
        int[] trustCount = new int[N + 1];
        int[] trustedByCount = new int[N + 1];

        for (int[] t : trust) {
            trustCount[t[0]]++;
            trustedByCount[t[1]]++;
        }

        for (int i = 1; i <= N; i++) {
            if(trustCount[i] == 0 && trustedByCount[i] == N - 1) {
                return i;
            }
        }

        return -1;
    }
}
