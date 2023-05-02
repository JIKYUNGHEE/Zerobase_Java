package com.gaeng0517._5th.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nmArray = sc.nextLine();
        int[] nm = Arrays.stream(nmArray.split(" ")).mapToInt(Integer::parseInt).toArray();
        int N = nm[0];
        int M = nm[1];

        //1. 빈 배열을 생성한다.
        int[][] array = new int[N + 1][M + 1];

        String[] lines = new String[N];
        for (int i = 0; i < N; i++) {
            lines[i] = sc.nextLine();
        }

        //2. 값을 채워 넣는다.
        for (int i = 0; i < lines.length; i++) {
            String[] nums = lines[i].split(" ");
            for (int j = 0; j < nums.length; j++) {
                array[i + 1][j + 1] = Integer.parseInt(nums[j]);
            }
        }

        //3. 더할 횟수를 구한다.
        int plusCnt = sc.nextInt();
        String[] plusLines = new String[plusCnt];
        for (int i = 0; i < plusCnt; i++) {
            plusLines[i] = sc.nextLine();
        }

        int[][] plusArray = new int[plusCnt][4];
        for (int i = 0; i < plusLines.length; i++) {
            String[] arrangeNums = plusLines[i].split(" ");
            for (int j = 0; j < arrangeNums.length; j++) {
                plusArray[i][j] = Integer.parseInt(arrangeNums[j]);
            }
        }

        for (int[] ints : plusArray) {
            for (int anInt : ints) {
                System.out.println(anInt+ " ");
            }
            System.out.println();
        }

    }
}