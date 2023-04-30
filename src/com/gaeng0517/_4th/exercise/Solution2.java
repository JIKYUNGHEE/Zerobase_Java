package com.gaeng0517._4th.exercise;

class Solution2 {
    public static void main(String[] args) {
        String right = "right";
        String left = "left";

        int[] numbers1 = {1, 2, 3};

        solution(numbers1, right);
        System.out.println();
        solution(numbers1, left);


//        int[] numbers2 = {4, 455, 6, 4, -1, 45, 6};
//        solution(numbers2, left);

    }

    public static int[] solution(int[] numbers, String direction) {
        int[] array = new int[numbers.length];

        if (direction.equals("right")) {
            for (int i = 0; i < numbers.length; i++) {
                if (i == numbers.length - 1) {
                    array[0] = numbers[numbers.length - 1];
                } else {
                    array[i + 1] = numbers[i];
                }
            }
        } else {
            for (int i = 0; i < numbers.length; i++) {
                if (i == 0) {
                    array[numbers.length - 1] = numbers[0];
                } else {
                    array[i-1] = numbers[i];
                }
            }
        }

        for (int number : array) {
            System.out.print(number + "\t");
        }
        return array;
    }
}