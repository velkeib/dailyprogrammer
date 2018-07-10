import java.util.*;
import java.lang.*;

public class DucciSequence{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> set = new ArrayList<>();
		
		String input = sc.nextLine();
		String[] split = input.split(", ");
		
		for(int i = 0; i < split.length; i++){
			set.add(Integer.parseInt(split[i]));
		}
		
		boolean loop = false;
		while(!loop){
			int first = set.get(0);
			for(int i = 0; i < set.size(); i++){
				if(i == set.size()-1){
					set.set(i, Math.abs(set.get(i)-first));
				}else{
					set.set(i, Math.abs(set.get(i)-set.get(i+1)));
				}
			}
			System.out.println(set);
			
			int j = 0;
			loop = true;
			while(loop && j < set.size()){
				if(set.get(j) != 0){
					loop = false;
				}
				j++;
			}	
		}
	}
}