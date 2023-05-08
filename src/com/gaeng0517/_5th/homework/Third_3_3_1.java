package com.gaeng0517._5th.homework;

import java.util.Arrays;

public class Third_3_3_1 {
    public static void main(String[] args) {

    }

    public int solution(int[] arr, int n) {
        Arrays.sort(arr);

        int answer = Integer.MAX_VALUE;
        for(int num:arr) {
            if(num >= n) {
                answer = num;
                break;
            }
        }
        return answer;
    }
}
