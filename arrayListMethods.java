import java.io.*;
import java.util.*;
class arrayListMethods {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		
		// Demonstrating the forEaach() method 
		
		list1.forEach(n->System.out.print(n+" "));
		System.out.println("");
		
		
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		
		// Demonstrating the retainAll() method 
		
		list1.retainAll(list2);
		System.out.println(list1);
		
		//Demonstrating the removeIf() method 
		
		list2.removeIf((n)-> (n%3==0));
		System.out.println(list2);
		
		//Demonstrating the get() method
		
		System.out.println(list1.get(1));
		
		//Demonstrating the set() method
		
		list2.set(1,4);
		System.out.println(list2);
		
		//Demonstrating the removeAll() method
		
		list1.removeAll(list2);
		System.out.println(list1);
		
		//Demonstrating the listIterator() method
		
		var iter = list1.listIterator();
		while(iter.hasNext()) {
			System.out.print(iter.next()+" ");
			
			
		}
		System.out.println("");
		
		
		
		//Demonstrating the toArray() method
		
		Integer[] arr = new Integer[list2.size()];
		arr = list1.toArray(arr);
		System.out.println(Arrays.toString(arr));
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
