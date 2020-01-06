
class stackUsingLinkedList {
    Node top;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    static stackUsingLinkedList push(stackUsingLinkedList list, int data) {
        Node newnode = new Node(data);
        if (list.top == null) {
            list.top = newnode;
        } else {
            newnode.next = list.top;

            list.top = newnode;
            return list;

        }
        return list;
    }

    static int pop(stackUsingLinkedList list) {
        if (list.top == null) {
            System.out.println("Stack Undeflow");
            return 0;
        } else {
            Node tempNode;
            tempNode = list.top.next;
            int x = list.top.data;
            list.top = tempNode;
            return x;
        }
    }

    static void peek(stackUsingLinkedList list) {
        if (list.top == null) {
            System.out.println("List is empty");
        } else {
            int x = list.top.data;
            System.out.println(x);
        }

    }

    public static void main(String[] args) {
        stackUsingLinkedList list = new stackUsingLinkedList();
        push(list, 5);
        push(list, 3);
        peek(list);
        int removedElement = pop(list);
        System.out.println(removedElement);
        removedElement = pop(list);
        System.out.println(removedElement);
        removedElement = pop(list);
        System.out.println(removedElement);

    }

}