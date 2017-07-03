package net.thingking.coding.leetcodeInJava;


import java.util.PriorityQueue;
import java.util.Stack;

/**
 * Created by darlynn on 5/20/17.
 *
 * No.572. Subtree of Another Tree
 *
 * Description:
 * Given two non-empty binary trees s and t, check whether tree t has exactly the same structure and node values with a subtree of s. A subtree of s is a tree consists of a node in s and all of this node's descendants. The tree s could also be considered as a subtree of itself.
 *
 */
//Example 1:
//        Given tree s:
//        3
//        / \
//        4   5
//        / \
//        1   2
//        Given tree t:
//        4
//        / \
//        1   2
//        Return true, because t has the same structure and node values with a subtree of s.
//Example 2:
//        Given tree s:
//        3
//        / \
//        4   5
//        / \
//        1   2
//        /
//        0
//        Given tree t:
//        4
//        / \
//        1   2
//        Return false.

public class IsSubTree {

    public static boolean solution(TreeNode s, TreeNode t) {
        String a, b;
        a = generatePreorderString(s);
        b = generatePreorderString(t);
        if (a.contains(b))
            return true;
        return false;
    }

    private static String generatePreorderString(TreeNode t) {
        StringBuilder sb = new StringBuilder();
        Stack<TreeNode> q = new Stack<>();
        q.push(t);
        while (q!=null) {
            TreeNode v = q.pop();
            if (v==null)
                sb.append(",#");
            else
                sb.append(","+v.val);
            q.push(v.right);
            q.push(v.left);
        }
        return sb.toString();
    }
}

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}