package de.mohammadamir.helper;

import java.util.Arrays;
import java.util.List;

public class BinaryMatrix {
    int[][] arr;

    BinaryMatrix(int[][] input) {
        arr = input;
    }

    public int get(int x, int y) {
        return arr[x][y];
    }

    public List<Integer> dimensions() {
        return Arrays.asList(arr.length, arr[0].length);
    }
}