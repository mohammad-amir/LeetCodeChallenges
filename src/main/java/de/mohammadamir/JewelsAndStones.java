package de.mohammadamir;

// Jewels And Stones
// https://leetcode.com/problems/jewels-and-stones/
public class JewelsAndStones {
    public int numJewelsInStones(String J, String S) {
        int jewelCount = 0;

        if (J != null && S != null && J.length() > 0 && S.length() > 0) {
            char[] jewels = J.toCharArray();
            for (char stone : S.toCharArray()) {
                for (char jewel : jewels) {
                    if (stone == jewel) {
                        jewelCount++;
                        break;
                    }
                }
            }
        }

        return jewelCount;
    }
}
