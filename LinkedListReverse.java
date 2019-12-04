import java.io.*;
import java.util.*;
import java.util.Scanner;

class LinkedListReverse {
	Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public static LinkedListReverse insert(LinkedListReverse list, int data) {

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

	public static void printList(LinkedListReverse list) {
		Node currentNode = list.head;
		System.out.println("Linked List : ");
		while (currentNode != null) {
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		}
	}

	public static LinkedListReverse reverseList(LinkedListReverse list) {

		Node prevNode = null;
		Node currentNode = list.head;
		Node nextNode = null;

		while (currentNode != null) {
			nextNode = currentNode.next;
			currentNode.next = prevNode;
			prevNode = currentNode;
			currentNode = nextNode;
		}
		list.head = prevNode;
		return list;
	}

	public static void main(String[] args) {
		LinkedListReverse list = new LinkedListReverse();
		list = insert(list, 1);
		list = insert(list, 2);
		list = insert(list, 3);
		list = insert(list, 4);
		list = insert(list, 5);
		list = insert(list, 6);
		list = insert(list, 7);
		list = insert(list, 8);
		printList(list);
		list = reverseList(list);
		printList(list);

	}
}
