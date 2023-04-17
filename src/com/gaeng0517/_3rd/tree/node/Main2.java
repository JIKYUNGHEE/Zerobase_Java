package com.gaeng0517._3rd.tree.node;

import java.util.LinkedList;
import java.util.Queue;

class BinaryTreeNode2 {
    class Node {
        char data;
        Node parent;
        Node left;
        Node right;

        public Node(char data, Node parent, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    Node[] nodes;

    BinaryTreeNode2(char[] arr) {
        nodes = new Node[arr.length];

        for (int i = 0; i < arr.length; i++) {
            nodes[i] = new Node(arr[i], null, null, null);
        }

        for (int i = 0; i < arr.length; i++) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            if (left < arr.length) {
                nodes[i].left = nodes[left];
                nodes[left].parent = nodes[i];
            }
            if (right < arr.length) {
                nodes[i].right = nodes[right];
                nodes[right].parent = nodes[i];
            }
        }
    }

    public Node findNode(char data) {
        for (int i = 0; i < nodes.length; i++) {
            if (nodes[i].data == data) {
                return nodes[i];
            }
        }
        return null;
    }

    public void findLeafNodes() {
        for (int i = 0; i < nodes.length; i++) {
            Node node = nodes[i];
            if (node.left == null && node.right == null) {
                System.out.print(node.data + " ");
            }
        }
    }

    public int findDepth(char data) {
        int depth = 0;
        Node node = findNode(data);
        while (node.parent != null) {
            depth++;
            node = node.parent;
        }
        return depth;
    }

    public void findNodesByLevel(int level) {
        for (int i = 0; i < nodes.length; i++) {
            Node node = nodes[i];
            int cnt = 0;
            while (node.parent != null) {
                node = node.parent;
                cnt++;
            }

            if (cnt == level) {
                System.out.print(nodes[i].data + " ");
            }
        }
    }

    public int getHeight() {
        int height = Integer.MIN_VALUE;
        for (int i = 0; i < nodes.length; i++) {
            int cnt = 0;
            Node node = nodes[i];
            while (node.parent != null) {
                node = node.parent;
                cnt++;
            }

            if (cnt > height) {
                height = cnt;
            }
        }

        return height;
    }

    public int getSize(char data) {
        Node node = findNode(data);
        if (node == null) {
            return 0;
        }
        int size = 1;
        if (node.left != null) {
            size += getSize(node.left.data);
        }
        if (node.right != null) {
            size += getSize(node.right.data);
        }

        return size;
    }

    public int checkSize(char data) {
        Node node = findNode(data);
        if(node == null) {
            return 0;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        int size = 0;

        while(!queue.isEmpty()) {
            Node cur = queue.poll();
            if(cur.left != null) {
                queue.offer(cur.left);
                size++;
            }

            if(cur.right != null) {
                queue.offer(cur.right);
                size++;
            }
        }

        return size + 1;
    }
}

public class Main2 {
    public static void main(String[] args) {
        char[] arr = new char[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (char) ('A' + i);
        }
        BinaryTreeNode2 binaryTreeNode2 = new BinaryTreeNode2(arr);

        //root node
        System.out.println("root node: " + binaryTreeNode2.nodes[0].data);

        //B's child node
        BinaryTreeNode2.Node nodeB = binaryTreeNode2.findNode('B');
        if (nodeB != null) {
            System.out.println("node B's child: " + nodeB.left.data + ", " + nodeB.right.data);
        }

        //F's parent node
        BinaryTreeNode2.Node nodeF = binaryTreeNode2.findNode('F');
        if (nodeF != null) {
            System.out.println("F's parent node: " + nodeF.parent.data);
        }

        //Left node
        System.out.print("Leaf nodes: ");
        binaryTreeNode2.findLeafNodes();
        System.out.println();

        //E's depth
        System.out.println("E's depth: " + binaryTreeNode2.findDepth('E'));

        //Level2 nodes
        System.out.println("Level2 nodes: ");
        binaryTreeNode2.findNodesByLevel(2);
        System.out.println();

        //Height
        System.out.println("Height: " + binaryTreeNode2.getHeight());

        //B's size
        System.out.println("B's size: " + binaryTreeNode2.getSize('B'));
        System.out.println("B's size: " + binaryTreeNode2.checkSize('B'));
    }
}
