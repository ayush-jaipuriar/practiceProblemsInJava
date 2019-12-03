import java.util.*;
import java.util.Scanner;

 class LinkedList {
    Node head;

    public static class Node {
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
        }

        else {
            Node lastNode = list.head;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;

        }

        return list;
    }

      public static void search(LinkedList list, int searchElement) {
        Node currentNode = list.head;
        while (currentNode != null) {
            if (currentNode.data == searchElement) {
                System.out.println("The element is present in the linked list ");
                return;
            }

        }
        System.out.println("Sorry, the element you searched for was not found in the give Linked List");
        return;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        list = insert(list, 6);
        list = insert(list, 7);
        list = insert(list, 8);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to search for in the given linked list");
        int searchElement = sc.nextInt();
        search(list, searchElement);
        sc.close();

    }

}