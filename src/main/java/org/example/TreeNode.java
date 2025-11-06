package org.example;

public class TreeNode {
    private int iData;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int iData) {
        this(iData, null, null);
    }

    public TreeNode(int iData, TreeNode left, TreeNode right) {
        this.iData = iData;
        this.left = left;
        this.right = right;
    }
}
