package net.thingking.coding.thinkingInJava.main.tree;

/**
 * Created by darlynn on 5/20/17.
 */
public class BinaryTreeNode<AnyType> {

    BinaryTreeNode left;
    BinaryTreeNode right;
    AnyType element;

    public BinaryTreeNode(AnyType element) {
        this.element = element;
    }

}

