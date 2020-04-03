import java.util.*;
import java.io.*;
class stackCollectionFramework {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		System.out.println("Empty stack :"+stack);
		System.out.println("Empty stack? : "+stack.isEmpty());
//		System.out.println("Empty stack, pop() operation : "+stack.pop()); EmptyStackException
		Integer[] arr = {1001,1002,1003,1004};
		for (int i=0; i<arr.length; i++) {
			stack.push(arr[i]);
		}
		System.out.println("Non Empty Stack: "+ stack);
		System.out.println("Non Empty Stack, peak operation :"+ stack.peek());
		System.out.println("Non Empty Stack, pop operation :"+ stack.pop());
		System.out.println("Non Empty Stack, after pop operation :"+ stack);
		System.out.println("Non Empty Stack, search operation for 1002 , Index is :"+ stack.search(1002));
		System.out.println("Non Empty Stack, search operation for 1(not present in stack) , Index is :"+ stack.search(1));
		System.out.println("Non Empty stack? "+ stack.isEmpty());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
