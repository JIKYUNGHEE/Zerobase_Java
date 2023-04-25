package com.gaeng0517._3rd.tree.homework;

import java.util.LinkedList;
import java.util.Queue;

public class First_3 {
    public int solution(int[] A) {
        Queue<Integer> queue = new LinkedList();
        int min = A[0];

        for(int i=1; i<A.length - 1; i++) {
            int num = A[i];
            if(min >= num) {
                min = num;
            } else {
                queue.offer(num);
            }
        }
        queue.offer(A[A.length-1]);

        int maxDiff = 0;
        while(!queue.isEmpty()) {
            int num = queue.poll();
            int diff = num - min;

            if(diff > maxDiff) {
                maxDiff = diff;
            }
        }

        return maxDiff;
    }
}
