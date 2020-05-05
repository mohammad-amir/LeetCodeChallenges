package de.mohammadamir;

import java.util.*;

// Group Anagrams
// https://leetcode.com/problems/group-anagrams
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> outputList = new ArrayList<>();
        Map<String, Integer> matchMap = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] strCharArray = strs[i].toCharArray();
            Arrays.sort(strCharArray);
            String sortedStr = new String(strCharArray);

            if (matchMap.containsKey(sortedStr)) {
                int outIndex = matchMap.get(sortedStr);
                outputList.get(outIndex).add(strs[i]);
            } else {
                List<String> li = new ArrayList<>();
                li.add(strs[i]);
                outputList.add(li);
                matchMap.put(sortedStr, outputList.size() - 1);
            }
        }

        return outputList;
    }
}
