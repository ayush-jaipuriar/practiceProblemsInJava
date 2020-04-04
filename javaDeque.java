import java.util.*;
import java.io.*;
class javaDeque {
	public static void main(String[] args) {
		Deque<Integer> numbers = new ArrayDeque<>();
		// Adding elements to the Deque
		numbers.addFirst(1);
		numbers.addLast(2);
		numbers.addLast(3);
		System.out.println("Deque :-"+numbers);
		
		//Peeking the first and last elements
		int firstElement = numbers.peekFirst();
		System.out.println("The first element is :- "+ firstElement);
		int lastElement = numbers.peekLast();
		System.out.println("The last element is :- "+ lastElement);
		
		//Removing the first and last elements
		int firstRemovedElement = numbers.removeFirst();
		System.out.println("The first removed element :- "+firstRemovedElement);
		System.out.println("Deque :- "+numbers);
		int lastRemovedElement = numbers.removeLast();
		System.out.println("The last removed element :- "+ lastRemovedElement);
		System.out.println("Deque :- "+lastRemovedElement);
		
		
		
		
		
		

		
		
		
		
		
		
		
		
	}
}
