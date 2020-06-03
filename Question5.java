package javaIO.question5;
import java.io.*;
import java.util.*;

//Java IO Question 5, by Ayush Jaipuriar 1705225 House Denver

public class Question5 {

    /* 
    Since the question states that CSV might be unordered, in that case I feel the best 
    approach would be to use a HashMap in order to first stored the key (colums) : value(index) pairs
    After that we use the key:value pairs to figure out the order 
    */
	 public static void main(String[] args) throws IOException {
	        Scanner sc = new Scanner(new FileInputStream("test1Unordered.csv"));
	        FileWriter writer = new FileWriter("output.txt");
	        Map<String, Integer> hashMap = new HashMap<>();
	        if (sc.hasNextLine()) {
	            String line = sc.nextLine();
	            String[] columns = line.split(",");
	            for (int i = 0; i < columns.length; i++) {
                    hashMap.put(columns[i], i);
                }
	                
                    writer.append("Player").append("\t");
                    writer.append("Position").append("\t");
                    writer.append("Team").append("\t");       
                    writer.append('\n');
	        }
	        while (sc.hasNextLine()) {
	            String line = sc.nextLine();
	            String[] columns = line.split(",");
	            writer.append(columns[hashMap.get("Player")]).append("\t");
	            writer.append(columns[hashMap.get("Position")]).append("\t");
                writer.append(columns[hashMap.get("Team")]).append("\t");
                writer.append('\n');
	        }
	        writer.close();
	    }

}