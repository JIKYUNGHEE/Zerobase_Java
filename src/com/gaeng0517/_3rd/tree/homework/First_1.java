package com.gaeng0517._3rd.tree.homework;

public class First_1 {

    public int solution(int n) {
        int answer = 1;

        if(n==1) {
            return answer;
        }

        answer = n*(n+1)/2;

        return answer;
    }
}
