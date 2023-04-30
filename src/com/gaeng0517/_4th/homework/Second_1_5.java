package com.gaeng0517._4th.homework;

import java.util.*;

public class Second_1_5 {
    public static void main(String[] args) {
        int[] arr1 = {1, 7, 8, 4};
        int[] arr2 = {2, 4, 6, 8};
        solution(arr1, arr2);
    }

    public static int[] solution(int[] arr1, int[] arr2) {
        List<Integer> list1 = new ArrayList<>();
        for (int i : arr1) {
            list1.add(i);
        }
        List<Integer> list2 = new ArrayList<>();
        for (int i : arr2) {
            list2.add(i);
        }

        list1.retainAll(list2);
        Collections.sort(list1);
        Integer[] answerArray = list1.toArray(new Integer[list1.size()]);
        int[] answer = new int[answerArray.length];
        int i = 0;
        for (Integer integer : answerArray) {
            answer[i] = integer;
            i++;
        }
        return answer;
    }
}
