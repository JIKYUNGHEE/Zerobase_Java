package com.gaeng0517._4th.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Second_2_4 {
    public int solution(int[] arr) {
        int answer = 0;

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            int cnt = 0;
            if (map.containsKey(num)) {
                cnt = map.get(num);
                map.put(num, cnt + 1);
            } else {
                map.put(num, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entity : map.entrySet()) {
            if(entity.getValue() == 2) {
                continue;
            }
            if(entity.getValue() == 1) {
                return entity.getKey();
            }
        }

        return answer;
    }
}
