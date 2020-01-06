import java.io.*;
import java.util.*;

class queue {
    static int front, rear, capacity;
    static int queue[];

    queue(int c) {
        front = -1;
        rear = -1;
        capacity = c;
        queue = new int[capacity];
    }

    static void enqueue(int data) {
        if (capacity == rear) {
            System.out.println("Queue is full");
            return;
        } else {
            rear++;
            queue[rear] = data;
            return;
        }

    }

    static int dequeue() {
        if (front == rear) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            return queue[++front];
        }
    }

    static void peek() {
        if (front == rear) {
            System.out.println("Queue is Empty");
            return;
        } else {
            System.out.println(queue[front + 1]);
        }
    }

    public static void main(String[] args) {
        queue q = new queue(4);
        enqueue(5);
        enqueue(4);
        peek();
        dequeue();
        peek();
        dequeue();
        peek();

    }
}
