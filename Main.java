package javaBasics.question2;
import java.io.*;

/* JAVA BASICS Question 2
 * By Ayush Jaipuriar, 1705225, House Denver
 * 
 * 
 *  A Java abstract class is a class that can't be instantiated. That means you cannot create new instances of an abstract class. It works as a base for subclasses.  
Create an abstract class Book which contains a variable string “title”, and two functions:-
	i.  setTitle(String s):- it is an abstract method
	ii. getTitle() of String type which return title.

    	 If you try to create an instance of this class you will get an error

Notice that the setTitle method is abstract too and has nobody. That means you must implement the body of that method in the child class.
   b. Write the main class and take “title” as input and create an instance of a class    
       MyBook.
Implement the MyBook class and print the title in the console.

 */

public class Main {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			String title = in.readLine();
			MyBook obj = new MyBook();
			obj.setTitle(title);
			System.out.println("The title is : "+ obj.getTitle());
		} catch (IOException e) {
			System.out.println("Sorry, an error occurred");
			e.printStackTrace();
			
		}
		
	}

}
