package de.mohammadamir;

import java.util.PriorityQueue;
import java.util.stream.IntStream;

// K Closest Points to Origin
// https://leetcode.com/problems/k-closest-points-to-origin/
public class KClosestPointsToOrigin {
    public int[][] kClosest(int[][] points, int K) {
        if (K >= points.length) {
            return points;
        }

        int[][] out = new int[K][2];

        double[] distance = new double[points.length];

        for (int i = 0; i < points.length; i++) {
            distance[i] = Math.pow(points[i][0], 2) + Math.pow(points[i][1], 2);
        }

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((x , y) -> Double.compare(distance[x], distance[y]));
        IntStream.range(0, points.length).forEach(i -> priorityQueue.add(i));

        int i = 0;
        while (K > 0) {
            out[i++] = points[priorityQueue.remove()];
            K--;
        }

        return out;
    }
}
