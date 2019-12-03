import java.io.*;
import java.util.Scanner;
import java.util.*;

class LinkedList {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {

            data = d;
            next = null;

        }
    }

    public static LinkedList insert(LinkedList list, int data) {

        Node newNode = new Node(data);
        newNode.next = null;

        if (list.head == null) {
            list.head = newNode;
        } else {

            Node lastNode = list.head;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;

        }
        return list;

    }

    public static void printList(LinkedList list) {
        Node currentNode = list.head;
        System.out.println("Linked List :");
        while (currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;

        }

    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list = insert(list, 1);
        printList(list);

    }

}