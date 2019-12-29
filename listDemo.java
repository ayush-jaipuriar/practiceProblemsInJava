import java.io.*;
import java.util.*;

class listDemo {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(3); // duplicates allowed in ArrayList
        list1.add(null); // null element allowed
        System.out.println("list1: " + list1);
        list1.remove(3);
        System.out.println("list1: " + list1);
        list1.remove(3);

        System.out.println("list1: " + list1);
        list1.add(10);
        System.out.println("list1: " + list1);
        list1.add(11);
        System.out.println("list1: " + list1);
        list1.set(4, 12);
        System.out.println("list1: " + list1);

        // BULK OPERATIONS
        Collection<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(12);
        System.out.println("List2: " + list2);

        System.out.println("list1: " + list1);
        list1.retainAll(list2);
        System.out.println("list1: " + list1);
        list2.add(12);
        System.out.println("list2.contains(2) =  " + list2.contains(2));
        System.out.println("list2.contains(2) =  " + list2.contains(3));
        list1.add(12);
        System.out.println("list1.indexOf(12) =  " + list1.indexOf(12));
        System.out.println("list1.indexOf(12) =  " + list1.lastIndexOf(12));
        System.out.println("list1.indexOf(12) =  " + list1.indexOf(15));

    }
}