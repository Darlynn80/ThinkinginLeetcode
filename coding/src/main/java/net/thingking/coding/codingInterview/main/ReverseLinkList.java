package net.thingking.coding.codingInterview.main;

import java.util.Stack;

public class ReverseLinkList {
    static class Node<T> {
        T val;
        Node next;
    }
    public static void printLinkedlist(Stack<Node> stack) {
        while (!stack.isEmpty()) {
            Node curNode = stack.pop();
            System.out.println(curNode.val);
        }
    }

    public static Stack reserveLinklist(Node head) {
        Stack stack = new Stack<Node>();
        Node node = head;
        while (node!=null) {
            stack.push(node);
            node = node.next;
        }
        return stack;
    }

    public static void main(String[] args) {
        Node node1=new Node();
        Node node2=new Node();
        Node node3=new Node();
        node1.val=1;
        node2.val=2;
        node3.val=3;
        node1.next=node2;
        node2.next=node3;

        printLinkedlist(reserveLinklist(node1));

        recursivePrint(node1);
    }

    public static void recursivePrint(Node node) {
        if (node!=null) {
            if (node.next !=  null) {
                recursivePrint(node.next);
            }
        }
        System.out.println(node.val);
    }
}
