package com.gaeng0517._4th.homework;

public class Second_2_3 {
    public int solution(int n) {
        int max = 1;
        while (Math.pow(max, 3) <= n) {
            max++;
        }
        return (int) Math.pow(max - 1, 3);
    }
}

