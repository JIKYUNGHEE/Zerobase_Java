package com.gaeng0517._4th.homework;

import java.util.Arrays;

public class Second_1_2 {
    public int solution(int[] arr) {
        int answer = 0;

        int sum = 0;
        int cnt = arr.length - 2;
        Arrays.sort(arr);
        for (int i = 1; i < arr.length - 1; i++) {
            sum += arr[i];
        }

        answer = sum / cnt;

        return answer;
    }
}
