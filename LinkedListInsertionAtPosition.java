import java.util.Scanner;

public class LinkedListInsertionAtPosition {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static LinkedListInsertionAtPosition insertAtPosition(LinkedListInsertionAtPosition list, int data,
            int position) {

        Node newNode = new Node(data); 
        if (list.head == null) { //for linked list empty condition
            list.head = newNode;
        } else {
            int index = 0;
            Node prevNode = null;
            Node currentNode = list.head;
            if (position == 0) { // for insertion into the head node position itself
                newNode.next = list.head;
                newNode.data = data;
                list.head = newNode;
                return list;
            }
            while (currentNode.next != null && index != position) {
                prevNode = currentNode;
                currentNode = currentNode.next;
                index++;
            }
            if (position > index) { //for position is greater than the number of nodes
                currentNode.next = newNode;
                newNode.data = data;
                newNode.next = null;
                return list;
            }
            prevNode.next = newNode; // for position is in between any of the nodes 
            newNode.data = data;
            newNode.next = currentNode;

        }
        return list;
    }
    
    public static LinkedListInsertionAtPosition insert(LinkedListInsertionAtPosition list, int data) {
        // normal insertion just to fill up the linked list before position based insertion is done
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
    
    public static void print(LinkedListInsertionAtPosition list) {
        Node currentNode = list.head;
        System.out.println("Linked List : ");
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        return;
    }

    public static void main(String[] args) {
        LinkedListInsertionAtPosition list = new LinkedListInsertionAtPosition();
        list = insert(list, 0);
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        print(list);
        System.out.println("Enter the position where you want ");
        Scanner sc = new Scanner(System.in);
        int position = sc.nextInt();
        insertAtPosition(list, 8, position);
        print(list);
        sc.close();

    }
}