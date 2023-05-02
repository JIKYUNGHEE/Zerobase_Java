package com.gaeng0517._4th.homework;

public class Second_2_5 {
    public static void main(String[] args) {
        System.out.println(solution(340));
        System.out.println(solution(-785));
    }

    public static int solution(int num) {
        int answer = 0;
        if (num > 100000 || num < -100000) {
            return 0;
        }

        while (num != 0) {
            answer = answer * 10 + num % 10;
            num /= 10;
        }
        return answer;
    }
}
