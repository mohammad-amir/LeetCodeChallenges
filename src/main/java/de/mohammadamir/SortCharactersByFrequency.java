package de.mohammadamir;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

// Sort Characters By Frequency
// https://leetcode.com/problems/sort-characters-by-frequency/
public class SortCharactersByFrequency {
    public String frequencySort(String s) {
        if (s == null || s.length() < 3) {
            return s;
        }

        StringBuilder sb = new StringBuilder(s.length());
        Map<Character, Integer> freqMap = new HashMap<>();

        for (char ch : s.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        PriorityQueue<Character> priorityQueue = new PriorityQueue<>((x , y) -> freqMap.get(y) - freqMap.get(x));
        priorityQueue.addAll(freqMap.keySet());

        while (!priorityQueue.isEmpty()) {
            Character character = priorityQueue.poll();
            for (int i = 0; i < freqMap.get(character); i++) {
                sb.append(character);
            }
        }

        return sb.toString();
    }
}
