package com.gaeng0517._3rd.tree.node;


import java.util.LinkedList;
import java.util.Queue;

class BinaryTreeNode {
    class Node {
        char data;
        Node left;
        Node right;

        public Node(char data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    Node[] nodes;

    BinaryTreeNode(char[] arr) {
        nodes = new Node[arr.length];

        for (int i = 0; i < arr.length; i++) {
            nodes[i] = new Node(arr[i], null, null);
        }

        for (int i = 0; i < arr.length; i++) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            if (left < arr.length) {
                nodes[i].left = nodes[left];
            }
            if (right < arr.length) {
                nodes[i].right = nodes[right];
            }
        }
    }

    public void preOrder(Node node) {
        System.out.print(node.data + " ");
        if (node.left != null) {
            preOrder(node.left);
        }

        if (node.right != null) {
            preOrder(node.right);
        }
    }

    public void inOrder(Node node) {
        if (node.left != null) {
            inOrder(node.left);
        }

        System.out.print(node.data + " ");

        if (node.right != null) {
            inOrder(node.right);
        }
    }

    public void postOrder(Node node) {
        if (node.left != null) {
            postOrder(node.left);
        }
        if (node.right != null) {
            postOrder(node.right);
        }
        System.out.print(node.data + " ");
    }

    public void levelOrder() {
        Queue<Node> queue = new LinkedList<>();
        Node root = this.nodes[0];
        queue.add(root);

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            System.out.print(node.data + " ");
            if (node.left != null) {
                queue.add(node.left);
            }

            if(node.right != null) {
                queue.add(node.right);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        char[] arr = new char[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (char) ('A' + i);
        }

        BinaryTreeNode binaryTreeArray = new BinaryTreeNode(arr);
        System.out.println("======preOrder======");
        binaryTreeArray.preOrder(binaryTreeArray.nodes[0]);
        System.out.println("\n======inOrder======");
        binaryTreeArray.inOrder(binaryTreeArray.nodes[0]);
        System.out.println("\n======postOrder======");
        binaryTreeArray.postOrder(binaryTreeArray.nodes[0]);
        System.out.println("\n======levelOrder======");
        binaryTreeArray.levelOrder();
    }
}
