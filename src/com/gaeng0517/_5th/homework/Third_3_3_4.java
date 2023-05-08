package com.gaeng0517._5th.homework;

public class Third_3_3_4 {
    public static void main(String[] args) {
        System.out.println(solution(12345));
    }

    public static int solution(int A) {
        int i = 50000;
        int sw = 0;
        int money = A;
        int cnt = 0;
        int totalCnt = 0;

        for (int j = 0; j < 10; j++) {
            cnt = money / i;
            money = money - (cnt * i);
            if (sw == 0) {
                i = i / 5;
                sw = 1;
            } else {
                i = i / 2;
                sw = 0;
            }
            totalCnt += cnt;
        }

        return totalCnt;
    }
}
