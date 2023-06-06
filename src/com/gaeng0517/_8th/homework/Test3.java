package com.gaeng0517._8th.homework;

//틀림ㅠㅠㅠㅠㅠ
public class Test3 {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        System.out.println(solution.solution(2, 5));
//        System.out.println("===========================");
//        System.out.println(solution.solution(3, 6));
//    }
}

//class Solution {
//    public int solution(int delay, int N) {
//        //n분 뒤에 새로 생긴 아메바의 수
////        int[] dp = new int[N + 1];
////
////        dp[0] = 1;
////        dp[1] = 2;
////
////        for (int i = delay + 1; i <= N; i++) {
////            dp[i] = dp[i - 1] + dp[i - 1 - delay];
////        }
//
//        //아메바 이름의 수
//        int[] names = new int[N + 1];
//        names[0] = 1;
//        names[1] = 3;
//        names[2] = 5;
//
//        if (delay == 1) {
//            for (int i = 3; i <= N; i++) {
//                names[i] = names[i - 1] + names[i - 2] + 1;
//            }
//        }
//
//        int pre = 2;
//
//        while(pre <= delay) {
//            for (int i = pre + 1; i <= N; i++) {
//                if(i < 6) {
//                    names[i] = names[i - 1] + names[i - pre] - 1;
//                } else {
//                    names[i] = names[i - 1] + names[i - pre] + 1;
//                }
//            }
//            pre++;
//
//            ////////sout///////
//            for (int name : names) {
//                System.out.print(name + "\t");
//            }
//            System.out.println();
//            System.out.println("pre: "+ pre+ ", --------------------");
//            ///////////////////
//        }
//
////        if (delay >= 2) {
////            for (int i = delay + 1; i <= N; i++) {
////                names[i] = names[i - 1] + names[i - delay] - 1;
////            }
////        }
//
//        ////////sout///////
//        for (int name : names) {
//            System.out.print(name + "\t");
//        }
//        System.out.println();
//        System.out.println("--------------------");
//        ///////////////////
//
//        return names[N];
//    }
//}