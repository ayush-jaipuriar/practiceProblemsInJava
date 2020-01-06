import java.io.*;
import java.util.*;

class stack {
    int top;
    int max = 10;
    int arr[] = new int[max];

    stack() {
        top = -1;
    }

    boolean push(int x) {
        if (top == max - 1) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            arr[++top] = x;
            return true;
        }
    }

    int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            return arr[top--];
        }
    }

    boolean peak() {
        if (top < 0) {
            System.out.println("Stack is empty");
            return false;
        } else {
            System.out.println(arr[top]);
            return true;
        }
    }

    public static void main(String[] args) {
        stack s = new stack();
        s.push(5);
        s.push(4);
        s.push(3);
        s.peak();

        s.pop();
        s.peak();

    }
}