package de.mohammadamir;

// Flood Fill
// https://leetcode.com/problems/flood-fill/
public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int baseColor = image[sr][sc];

        if (baseColor != newColor) {
            floodFill(image, sr, sc, newColor, baseColor);
        }

        return image;
    }

    private void floodFill(int[][] image, int sr, int sc, int newColor, int baseColor) {
        if (sc >= 0 && sr >= 0 && image.length > sr && image[0].length > sc && image[sr][sc] == baseColor) {
            image[sr][sc] = newColor;

            floodFill(image, sr, sc + 1, newColor, baseColor);
            floodFill(image, sr, sc - 1, newColor, baseColor);
            floodFill(image, sr + 1, sc, newColor, baseColor);
            floodFill(image, sr - 1, sc, newColor, baseColor);
        }
    }
}
