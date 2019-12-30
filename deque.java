import java.util.*;

class deque {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        // FIFO( Queue using ArrayDeque )
        deque.add("Walden");
        deque.add("Harry Potter");
        deque.add("Geeks for Geeks");
        for (int i = 0; i < 3; i++) {
            System.out.println(deque.remove());
        }

        // LIFO ( Stack using ArrayDeque )
        deque.push("Walden");
        deque.push("Harry Potter");
        deque.push("Geeks for Geeks");
        for (int i = 0; i < 3; i++) {
            System.out.println(deque.pop());
        }
    }
}