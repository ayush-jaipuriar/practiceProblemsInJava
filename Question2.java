package javaIO.question2;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;

//Java IO Question 2, by Ayush Jaipuriar 1705225 House Denver

public class Question2{
	
	public static void main(String[] args) throws  IOException, FileNotFoundException{
        
        try (FileReader fr = new FileReader("text1.txt");  
        BufferedReader br = new BufferedReader(fr); 
        FileWriter fw = new FileWriter("text2.txt"); //try-with-resources does Automatic Resource Management
        ) {
		String line;
        while((line = br.readLine()) != null) { 
            line = line.trim(); 
            line=line.replaceAll("\\s+", "");
            fw.write(line);
        }
        
    }

}
}