package com.gaeng0517._5th.homework;

import java.util.Arrays;

public class Third_3_2_1 {
    public static void main(String[] args) {
        System.out.println(solution("134246", 4));
    }

    public static int solution(String s, int n) {
        int[] nums = new int[10];
        int[] inputs = Arrays.stream(s.split("")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < inputs.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (inputs[i] == j) {
                    nums[j] += 1;
                }
            }
        }

        return nums[n];
    }
}
