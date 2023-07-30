package com.work.tree;

/**
 * @Author：xhquan
 * @Project：algorithm_work
 * @since：2023/7/30 15:42
 */
public class Node {
    private Integer value;

    private Node left;

    private Node right;

    public Node(Integer value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
