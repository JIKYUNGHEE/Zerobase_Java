package com.gaeng0517._6th.homework;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public int solution(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 2; i < n; i++) {
            int cnt = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    cnt++;
                }
            }
            if (cnt == 2) {
                list.add(i);
            }
        }

        return list.size();
    }
}
