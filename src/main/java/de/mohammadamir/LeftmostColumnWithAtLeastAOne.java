package de.mohammadamir;


import de.mohammadamir.helper.BinaryMatrix;

import java.util.List;

// Leftmost Column with at Least a One
// https://leetcode.com/problems/leftmost-column-with-at-least-a-one/
public class LeftmostColumnWithAtLeastAOne {
    public static int leftMostColumnWithOne(BinaryMatrix binaryMatrix) {
        int index = -1;

        if (binaryMatrix != null) {
            List<Integer> dimensions = binaryMatrix.dimensions();

            if (dimensions != null && dimensions.size() == 2) {
                int rows = dimensions.get(0);
                int cols = dimensions.get(1);

                if (rows > 0 && cols > 0) {
                    index = cols - 1;

                    for (int r = 0; r < rows; r++) {
                        int left = 0;
                        int right = cols - 1;

                        while (left != right) {
                            int c = (left + right) / 2;
                            int val = binaryMatrix.get(r, c);

                            if (val == 1) {
                                right = c;
                            } else {
                                left = c + 1;
                            }
                        }

                        index = Math.min(index, left);
                    }

                    int sum = 0;

                    for (int r = 0; r < rows; r++) {
                        sum += binaryMatrix.get(r, index);
                    }

                    if (sum < 1) {
                        index = -1;
                    }
                }
            }
        }

        return index;
    }
}
