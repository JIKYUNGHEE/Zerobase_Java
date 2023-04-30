package com.gaeng0517._4th.exercise;

import java.util.List;
import java.util.ArrayList;

class Solution1 {
    public static void main(String[] args) {
        solution(10);
        solution(9);
    }

    public static int[] solution(int n) {
        List<Integer> answerList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                answerList.add(i);
            }
        }

        int size = 0;
        if (n % 2 == 0) {
            size = n / 2;
        } else {
            size = n / 2 + 1;
        }
        Integer[] answer1 = answerList.toArray(new Integer[size]);
        int[] answer = new int[answer1.length];
        int i = 0;
        for (Integer num : answer1) {
            answer[i] = num;
            i++;
        }
        return answer;
    }
}