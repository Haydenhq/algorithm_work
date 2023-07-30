package com.work.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Author：xhquan
 * @Project：algorithm_work
 * @since：2023/7/30 15:39
 */
public class Tree {
    public static void main(String[] args) {
        List<Node> list = new ArrayList<>();
        List<Node> list2 = new ArrayList<>();
        Node node1 = new Node(1, null, null);
        Node node2 = new Node(2, null, null);
        Node node3 = new Node(3, node1, null);
        Node node4 = new Node(4, null, node2);
        Node node5 = new Node(5, node4, node3);

        preorderTraversal(list, node5);
        inorderTraversal(list2, node5);

        List<Integer> list3 = inorderTraversal1(node5);

        List<Integer> list1 = preorderTraversal1(node5);

        System.out.println(list.size());
        System.out.println(list1.size());


    }

    /**
     * 递归前序便遍历
     *
     * @param res  结果
     * @param root 跟节点
     */
    private static void preorderTraversal(List<Node> res, Node root) {
        if (root == null) {
            return;
        } else {
            res.add(root);
        }
        if (root.getLeft() != null) {
            preorderTraversal(res, root.getLeft());
        }

        if (root.getRight() != null) {
            preorderTraversal(res, root.getRight());
        }
    }

    /**
     * 非递归前序遍历
     *
     * @param root 跟节点
     */
    private static List<Integer> preorderTraversal1(Node root) {
        List<Integer> res = new ArrayList<>();
        Stack<Node> stack = new Stack<>();

        return res;
    }

    public static void inorderTraversal(List<Node> res, Node root) {
        if (root == null) {
            return;
        }
        if (root.getLeft() != null) {
            inorderTraversal(res, root.getLeft());
        }
        res.add(root);
        if (root.getRight() != null) {
            inorderTraversal(res, root.getRight());
        }
    }

    public static List<Integer> inorderTraversal1(Node root) {
        Stack<Node> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();

        return list;
    }


}
