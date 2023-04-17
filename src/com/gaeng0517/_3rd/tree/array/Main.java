package com.gaeng0517._3rd.tree.array;

class BinaryTreeArray {
    char[] arr;

    BinaryTreeArray(char[] arr) {
        this.arr = arr.clone();
    }

    public void preOrder(int index) {
        System.out.print(arr[index]+" ");
        int left = index * 2 + 1;
        int right = index * 2 + 2;
        if (left < arr.length) {
            preOrder(left);
        }
        if (right < arr.length) {
            preOrder(right);
        }
    }

    public void inOrder(int index) {
        int left = index * 2 + 1;
        int right = index * 2 + 2;
        if (left < arr.length) {
            inOrder(left);
        }

        System.out.print(arr[index]+" ");

        if (right < arr.length) {
            inOrder(right);
        }
    }

    public void postOrder(int index) {
        int left = index * 2 + 1;
        int right = index * 2 + 2;
        if (left < arr.length) {
            postOrder(left);
        }
        if (right < arr.length) {
            postOrder(right);
        }
        System.out.print(arr[index]+" ");
    }

    public void levelOrder() {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

public class Main {

    public static void main(String[] args) {
        char[] arr = new char[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (char) ('A' + i);
        }

        BinaryTreeArray binaryTreeArray = new BinaryTreeArray(arr);
        System.out.println("======preOrder======");
        binaryTreeArray.preOrder(0);
        System.out.println("\n======inOrder======");
        binaryTreeArray.inOrder(0);
        System.out.println("\n======postOrder======");
        binaryTreeArray.postOrder(0);
        System.out.println("\n======levelOrder======");
        binaryTreeArray.levelOrder();
    }
}
