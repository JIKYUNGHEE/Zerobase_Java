package com.gaeng0517._4th.homework;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Second_1_4 {
    public static void main(String[] args) {
        System.out.println(solution("Hello world nice world"));
    }
    public static int solution(String s) {
        if (s == null || s.isBlank()) {
            return 0;
        }
        return Arrays.asList(s.split(" ")).stream()
                .distinct()
                .collect(Collectors.counting()).intValue();
    }
}
