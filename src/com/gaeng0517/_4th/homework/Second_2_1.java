package com.gaeng0517._4th.homework;

public class Second_2_1 {
    public static void main(String[] args) {

    }

    public int solution(int[] useageArr, int fee) {
        int answer = 0;

        int sum = 0;
        for (int i : useageArr) {
            sum += i;
        }
        answer = sum * fee;

        return answer;
    }
}
