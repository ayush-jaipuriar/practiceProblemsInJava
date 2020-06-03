package javaIO.question4;
import java.io.BufferedWriter;
import java.io.*;

//Java IO Question 4, by Ayush Jaipuriar 1705225 House Denver

public class Question4 {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		Writer fwtr=null;
        BufferedWriter bwtr=null;
        
		
		try {
			
			fwtr=new FileWriter("output.txt");
			bwtr=new BufferedWriter(fwtr);				
			String line="";
            String splitBy=",";
            BufferedReader br = new BufferedReader(new FileReader("test1.csv"));  
            while ((line = br.readLine()) != null)     {
                String[] player = line.split(splitBy);    // use comma as separator  
                String playerInfo= "Player[Name = "+ player[0]+" , Position = "+ player[1]+ " , Team = "+ player[2]+"]";
                System.out.println(playerInfo);
                bwtr.write(playerInfo);
                bwtr.write('\n');
            }
            
			
		}catch(Exception e) {
			System.out.println("Exception occured while writing from the file :- "+e);
		}
		finally {
			try {
				if(bwtr!=null)
				{
					bwtr.close();
				}
			}catch(Exception e){
				System.out.println("Exception occured closing Buffered writer :- "+e);
			}
			try {
				if(fwtr!=null)
				{
					fwtr.close();
				}
			}catch(Exception e){
				System.out.println("Exception occured closing File writer :- "+e);
			}
		}
		
	}	
}

