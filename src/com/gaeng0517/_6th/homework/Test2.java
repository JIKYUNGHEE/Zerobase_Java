package com.gaeng0517._6th.homework;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String[] args) {
        String[] names = {"제로", "베이스", "자바", "스쿨", "자바", "베이스", "베이스", "백엔드", "화이팅"};
        System.out.println(solution(names));
    }
    static int [][] combi = new int[101][101];

    public static int solution(String[] names) {
        List<String> list = Arrays.asList(names)
                .stream()
                .distinct()
                .collect(Collectors.toList());

        String[] arr = list.toArray(new String[list.size()]);

        return combination(arr, list.size(), 4);
    }

    public int DFS(int n, int r){
        // 이미 재귀가 돌아서 구한 값이냐?
        // 구한값이라면 재귀돌지말고 그 값을 가져와라
        if(combi[n][r] > 0) return combi[n][r];
        if(n == r || r==0) return 1;
        else return combi[n][r] = DFS(n-1, r-1) + DFS(n-1, r);
    }

    static int combination(String[] arr, int n, int r) {
        if(combi[n][r] > 0) return combi[n][r];
        if(r==0 || r==n) return 1;
        else return combi[n][r] = combination(arr, n-1, r-1) + combination(arr, n-1, r);

    }

    static void combination2(String[] arr, boolean[] visited, int depth, int n, int r) {
        if (r == 0) {
            for (int i = 0; i < n; i++) {
                if (visited[i]) {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();

            return;
        }

        if (depth == n) {
            return;
        }

        visited[depth] = true;
        combination2(arr, visited, depth + 1, n, r - 1);

        visited[depth] = false;
        combination2(arr, visited, depth + 1, n, r);
    }


}
