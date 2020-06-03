package javaIO.question3;
import java.io.*;
import java.util.*;

//Java IO Question 3, by Ayush Jaipuriar 1705225 House Denver

class Question3 {
	public static void main(String[] args)throws Exception {
	
	File file = new File("text1.txt");
    try (              //Using try-with-resources for Automatic Resource Management, as both Scanner and FileWriter implement the AutoClosable interface
        Scanner sc = new Scanner(file);
        FileWriter fw=new FileWriter("text2.txt");) {

        sc.useDelimiter("\n");
        StringBuilder sb = new StringBuilder();
        
        while (sc.hasNext()) {    //Reading the file
            String str = sc.nextLine();
            sb.append(str).append('\n'); //Since scanner removes delimiter while reading hence at the end of each line I attach a newline
        }
    
        String[] lines = sb.toString().split("\n");    //Split the lines on basis of newline delimiter I just appended before
        
        for (int i=0; i<lines.length; i++) {
            String[] words = lines[i].split(" ");
            for (int j=0; j<words.length; j++) {
                fw.write(Character.toUpperCase(words[j].charAt(0)) + words[j].substring(1)+" ");
            }
            fw.write("\n");
        	
        }

    } catch (Exception e) {
        System.out.println("Operation Failed");
        e.printStackTrace();
    }

    System.out.println("Operation Successful");
    
    
    
        
        

        
        
       
    
    }
}
    
