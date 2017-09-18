package net.thingking.coding.codingInterview.main;

import java.util.Arrays;

public class RebuildBinaryTree {

    public static void main(String[] args) throws Exception {
        int[] preSort={1,2,4,7,3,5,6,8};
        int[] inSort={4,7,2,1,5,3,8,6};
        BinaryTreeNode root= new RebuildBinaryTree().constructTree(preSort,inSort);
    }

    public class BinaryTreeNode {

        public int value;
        public BinaryTreeNode left;
        public BinaryTreeNode right;

        public BinaryTreeNode() { }

        public BinaryTreeNode(int val) {
            this.value = val;
        }
    }

    public BinaryTreeNode constructTree(int[] preOrder, int[] inOrder) throws Exception {
        if (preOrder==null || inOrder==null) {
            return null;
        }
        if (preOrder.length != inOrder.length) {
            throw new Exception("长度不一样,非法的输入");
        }
        BinaryTreeNode root = new BinaryTreeNode();
        for (int i=0; i<inOrder.length; i++) {
            if (inOrder[i]==preOrder[0]) {
                root.value = inOrder[i];
                System.out.print(root.value);
                root.left = constructTree(Arrays.copyOfRange(preOrder, 1, i+1), Arrays.copyOfRange(inOrder ,0, i));
                root.right = constructTree(Arrays.copyOfRange(preOrder, i+1, preOrder.length), Arrays.copyOfRange(inOrder, i+1, inOrder.length));
            }
        }
        return root;
    }
}
