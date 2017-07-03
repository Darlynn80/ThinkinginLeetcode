package net.thingking.coding.leetcodeInJava;


import javax.swing.tree.TreeNode;

/**
 * Created by darlynn on 4/23/17.
 *
 * No.563 from www.leetcode.com
 *
 * Description:
 * Given a binary tree, return the tilt of the whole tree.
 * The tilt of a tree node is defined as the absolute difference
 * between the sum of all left subtree node values and the sum of all right subtree node values. Null node has tilt 0.
 *
 * The tilt of the whole tree is defined as the sum of all nodes' tilt.
 *
 * Note:
 * The sum of node values in any subtree won't exceed the range of 32-bit integer.
 * All the tilt values won't exceed the range of 32-bit integer.
 */
//Input:
//         1
//        /   \
//        2     3
//        Output: 1
//        Explanation:
//        Tilt of node 2 : 0
//        Tilt of node 3 : 0
//        Tilt of node 1 : |2-3| = 1
//        Tilt of binary tree : 0 + 0 + 1 = 1
public class BinaryTreeTilt {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */

    int tilt = 0;
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }
    public int findTilt(TreeNode root) {
        postOrder(root);
        return tilt;
    }

    public int postOrder(TreeNode root) {
        if(root == null)
            return 0;
        int leftSum = postOrder(root.left);
        int rightSum = postOrder(root.right);
        tilt += Math.abs(leftSum-rightSum);
        return leftSum+rightSum+root.val;
    }
}
