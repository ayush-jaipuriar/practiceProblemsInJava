package javaIO.question1;
import java.io.*;
import java.util.*;

// Java IO Question 1, by Ayush Jaipuriar 1705225 House Denver

class test {
	public static void main(String[] args)throws Exception {
	File file = new File("text1.txt");
    try (              //Using try-with-resources for Automatic Resource Management, as both Scanner and FileWriter implement the AutoClosable interface
        Scanner sc = new Scanner(file);
        FileWriter fw=new FileWriter("test2.txt");) {

        sc.useDelimiter("\n");
        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<>(); //As the question asked us to use Collections hence I used ArrayList
        while (sc.hasNext()) {    //Reading the file
            String str = sc.nextLine();
            sb.append(str).append('\n'); //Since scanner removes delimiter while reading hence at the end of each line I attach a newline
        }
    
        String[] arr = sb.toString().split("\n");    //Split the lines on basis of newline delimeter I just appended before
        list = Arrays.asList(arr);    
        int x= arr.length-5;
        if (x<0) {
            for (int i=0; i<arr.length; i++) {
                System.out.println(arr[i]);
                fw.write(list.get(i));
                fw.write("\n");
            }  
        } else if (x>=0) {
            for (int i=x; i<arr.length; i++) {
                System.out.println(arr[i]);
                fw.write(list.get(i));
                fw.write("\n");
            }  
            
        }

    } catch (Exception e) {
        System.out.println("Operation Failed");
        e.printStackTrace();
    }

    System.out.println("Operation Successful");
    
    
    
        
        

        
        
       
    
    }
}
    
