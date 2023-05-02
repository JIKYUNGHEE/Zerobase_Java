package com.gaeng0517._4th.homework;

import java.util.ArrayList;
import java.util.List;

public class Second_2_2 {

    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];

        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);

            if (num % 2 != 0) {
                list.add(num);
            }
        }

        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

}
