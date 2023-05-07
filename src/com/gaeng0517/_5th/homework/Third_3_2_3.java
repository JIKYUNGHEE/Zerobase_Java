package com.gaeng0517._5th.homework;

public class Third_3_2_3 { //TODO. 다시
    public static void main(String[] args) {
        int[] arr = {};
        String prefix = "";
        String separator = "";
        String postfix = "";

        System.out.println(solution(arr, prefix, separator, postfix));
    }

    public static String solution(int[] arr, String prefix, String separator, String postfix) {
        StringBuilder sb = new StringBuilder();
        if (!prefix.isEmpty()) {
            sb.append(prefix);
        }

        for (int num : arr) {
            sb.append(num);
            sb.append(separator);
        }

        String answer = "";

        int length = sb.length();
        if (length > 0) {
            sb.replace(length - separator.length(), length, "");
        }
        if (!postfix.isEmpty()) {
            sb.append(postfix);
        }

        answer = sb.toString();
        return answer;
    }
}
