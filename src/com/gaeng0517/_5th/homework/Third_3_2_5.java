package com.gaeng0517._5th.homework;

import java.util.Arrays;

public class Third_3_2_5 {
    public static void main(String[] args) {

    }

    public int solution(int[] arr, int n) {
        Arrays.sort(arr);

        int answer = -1;
        for (int num : arr) {
            if(num <= n) {
                answer = num;
            } else {
                break;
            }
        }

        return answer;
    }
}
