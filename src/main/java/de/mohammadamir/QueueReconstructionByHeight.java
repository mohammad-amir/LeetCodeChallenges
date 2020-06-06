package de.mohammadamir;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

// Queue Reconstruction by Height
// https://leetcode.com/problems/queue-reconstruction-by-height/
public class QueueReconstructionByHeight {
    public int[][] reconstructQueue(int[][] people) {
        List<int[]> outList = new ArrayList<>();

        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>((x, y) -> x[0] == y[0] ? x[1] - y[1] : y[0] - x[0]);
        priorityQueue.addAll(Arrays.asList(people));

        while (!priorityQueue.isEmpty()) {
            int[] p = priorityQueue.poll();
            outList.add(p[1], p);
        }

        return outList.toArray(new int[people.length][]);
    }
}
