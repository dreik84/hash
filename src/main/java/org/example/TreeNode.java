package org.example;

public class TreeNode implements HashChainCollection {
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

    @Override
    public void insert(int key) {

    }

    @Override
    public void delete(int key) {

    }

    @Override
    public boolean find(int key) {
        return false;
    }
}
