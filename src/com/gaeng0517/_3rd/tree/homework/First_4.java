package com.gaeng0517._3rd.tree.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class First_4 {
    public static int solution(String s) {
        int answer = 0;

        Map<String, Integer> map = new HashMap();

        String[] splits = s.split("");
        for (int i = 0; i < splits.length; i++) {
            String splitNum = splits[i];
            int cnt = map.getOrDefault(splitNum, 0);
            map.put(splitNum, ++cnt);
        }

        int max = Integer.MIN_VALUE;
        String maxKey = "";
        List<String> answerList = new ArrayList();
        for (String key : map.keySet()) {
            int value = map.get(key);
            if (value > max) {
                max = value;
                maxKey = key;
            }
        }
        answer = Integer.parseInt(maxKey);
        return answer;
    }
}
