import java.io.*;
import java.util.*;
class regularExpressions {
	public static void main(String[] args) {
		String st = "My name is Jurgen Klopp";
		st = st.replaceAll("Klopp","Guardiola");
		System.out.println(st);
		boolean doesMatch = st.matches("My name is Jurgen Guardiola");
		System.out.println(doesMatch);
		
		st = "aa bb cc dd aa bbaa";
		System.out.println(st.replaceAll("^aa", "XX"));
		System.out.println(st.replaceAll("aa$", "XX"));
		System.out.println(st.replaceAll("[abc][ ]", "X"));
		
		System.out.println(st.replaceAll("[^a\\s]","X"));
		
		st = "abcdefghijklmnopqrstuvwxzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		System.out.println(st.replaceAll("(?i)[a-z0-9]","X"));
		System.out.println(st.replaceAll("\\d", "X"));
		System.out.println(st.replaceAll("\\D", "X"));
		
		st = "My name is Ayush Jaipuriar";
		System.out.println(st.replaceAll("\\w","X"));
		System.out.println(st.replaceAll("\\W","X"));
		System.out.println(st.replaceAll("\\b","X"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
