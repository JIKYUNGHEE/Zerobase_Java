package com.gaeng0517._4th.homework;

import java.util.HashMap;
import java.util.Map;

////////////////// 틀림 //////////////////
public class Second_1_3 {
    public static void main(String[] args) {
        String p1 = "가나다라";
        String s1 = "바나나 드래곤 스팅 오열";
        System.out.println(solution(p1, s1));

        String p2 = "갸가갸가";
        String s2 = "금도끼 은도끼 철도끼 은도끼";
        System.out.println(solution(p2, s2));
    }

    public static boolean solution(String p, String s) {
        //1. p를 spilt
        String[] arrayKey = p.split("");
        String[] arrayValue = s.split(" ");

        Map<String, String> map = new HashMap<>();
        //2. 각 배열을 키로하는 맵을 만든다.
        for (int i = 0; i < arrayKey.length; i++) {
            String key = arrayKey[i];
            String value = arrayValue[i];
            if (map.containsKey(key)) {
                String mapValue = map.get(key);
                if (!mapValue.equals(value)) {
                    return false;
                }
            } else {
                map.put(key, value);
            }
        }
        return true;
    }
}
