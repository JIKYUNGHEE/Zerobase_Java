package com.gaeng0517._5th.homework;

import java.util.*;

public class Third_3_2_2 {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 6, 9, 12};
        int[] arr2 = {2, 4, 6, 8, 10, 12};
        for (int num : solution(arr1, arr2)) {
            System.out.print(num + "\t");
        }
    }

    public static int[] solution(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        List<Integer> list = new ArrayList<>(); //중복된 수를 담을 배열

        Map<Integer, Integer> map = new HashMap<>();
        for (int num1 : arr1) {
            map.put(num1, 1);
        }
        for (int num2 : arr2) {
            int cnt = map.getOrDefault(num2, 0);
            if(cnt > 0) {
                list.add(num2);
                map.put(num2, ++cnt);
            } else {
                map.put(num2, 1);
            }
        }

        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
