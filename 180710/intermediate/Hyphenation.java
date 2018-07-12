import java.util.*;
import java.io.*;
import java.lang.*;

public class Hyphenation{
	public static void main(String[] args)throws Exception{
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		check(input);
	}
	
	public static String convert(String part){
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < part.length(); i++){
			if(Character.isLetter(part.charAt(i))){
				 sb.append(part.charAt(i));
			}
		}
		return sb.toString();
	}
	
	public static void check(String word)throws Exception{
		Scanner sc = new Scanner(new FileReader(new File("patterns.txt")));
		
		while(sc.hasNextLine()){
			String part = sc.nextLine();
			String fix = convert(part);
			
			matches(word, fix, part);
		}
	}
	
	public static void matches(String word, String fix, String part){
		int[] between = new int[word.length()-1];
		
		for(int i = 0; i < between.length; i++){
			between[i]=0;
		}
		
		for(int i = 0; i <= word.length()-fix.length(); i++){
			boolean matches = true;
			for(int j = 0; j < fix.length(); j++){
				if(word.charAt(i+j) != fix.charAt(j)){
					matches = false;
				}
			}
			if(i != 0 && part.charAt(0)=='.'){
				matches = false;
			}
			if(i != word.length()-fix.length() && part.charAt(part.length()-1) == '.'){
				matches = false;
			}
			if(matches){
				int[] partbetween = new int[part.length()+1];
				for(j = 0; j < part.length(); i++){
					if(Character.isDigit(part.charAt(i))){
						
					}
					
					
					
					/*if(Character.isDigit(part.charAt(0)) && Integer.parseInt(part.charAt(0)) > between[i-1]){
						between[i-1] = Integer.parseInt(part.charAt(0));
					}*/
				}
			}
		}
	}
}