package com.gaeng0517._4th.homework;

import java.util.Arrays;

public class Second_1_1 {
    public static void main(String[] args) {

    }

    public int solution(int[] arr) {
        int answer = 0;

        int[] array = arr;
        Arrays.sort(array);

        int size = array.length;
        int line1 = array[size - 1];
        int line2 = array[size - 2];
        int line3 = array[size - 3];

        answer = line1 + line2 + line3;
        return answer;
    }
}
