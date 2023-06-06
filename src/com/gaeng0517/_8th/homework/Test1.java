package com.gaeng0517._8th.homework;

public class Test1 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] trust = {{1, 1}, {2, 1}, {3, 2}};
        System.out.println(solution.solution(3, trust));

        int[][] trust2 = {{1, 3}, {2, 3}};
        System.out.println(solution.solution(3, trust2));

    }
}

class Solution {
    public int solution(int N, int[][] trust) {
        int count = 0;
        int allCount = 0;
        int pre = trust[0][1];
        int candidate = trust[0][1];
        boolean all = true;
        for (int i = 0; i < trust.length; i++) {
            if (pre == candidate) {
                allCount++;
            }
            if (candidate == trust[i][1]) {
                count++;
            }
            pre = trust[i][1];
        }

        if (allCount == N - 1 && count == N - 1) {
            return candidate;
        }

        return -1;
    }
}
