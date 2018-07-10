import java.util.*;
import java.io.*;

public class EIC{
	public static void main(String[] args)throws IOException{
		Scanner sc = new Scanner(new FileReader(new File("input.txt")));
		int count = 0;
		while(sc.hasNextLine()){
			String input = sc.nextLine();
			
			if(!exception(input)){
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static boolean exception(String arg){
		/*boolean ei = false;
		boolean ie = false;
		boolean c = false;*/
		for(int i = 0; i < arg.length()-1; i++){
			if(arg.charAt(i)=='e' && arg.charAt(i+1)=='i'){
				if(i==0){
					return false;
				}else{
					if(arg.charAt(i-1)!='c'){
						return false;
					}
				}
			}
			if(arg.charAt(i)=='i' && arg.charAt(i+1)=='e'){
				if(i>0){
					if(arg.charAt(i-1)=='c'){
						return false;
					}
				}
			}
		}
		return true;
	}
	
	
	public static boolean check(String arg){
		boolean ei = false;
		boolean ie = false;
		boolean c = false;
		for(int i = 0; i < arg.length(); i++){
			if(i < arg.length()-1){
				if(arg.charAt(i)=='i' && arg.charAt(i+1)=='e'){
					ie = true;
				}
				if(arg.charAt(i)=='e' && arg.charAt(i+1)=='i'){
					ei = true;
				}
			}
			if(arg.charAt(i)=='c'){
				c = true;
			}
		}
		
		if((ei && c) || (ie && !c) || (!c && !ei && !ei)){
			return true;
		}if((ie && c) || (ei && !c)){
			return false;
		}
		return true;
	}	
}