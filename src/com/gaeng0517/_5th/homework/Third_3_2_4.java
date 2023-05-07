package com.gaeng0517._5th.homework;

public class Third_3_2_4 {
    public static void main(String[] args) {

    }

    public boolean solution(boolean[][] matrix, boolean b) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] != b) {
                    return false;
                }
            }
        }

        return true;
    }
}
