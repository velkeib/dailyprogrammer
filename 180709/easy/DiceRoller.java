import java.util.*;
import java.io.*;

public class DiceRoller{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> sums = new ArrayList<>();
		
		while(sc.hasNextLine()){
			String input = sc.nextLine();
			
			if(input.equals("d")){
				for(int i = 0; i < sums.size(); i++){
					System.out.println(sums.get(i));
				}
				System.exit(0);
			}
			
			String[] split = input.split("d");
			
			int sum = 0;
			for(int i = 0; i < Integer.parseInt(split[0]); i++){
				Random r = new Random();
				sum = sum + r.nextInt(Integer.parseInt(split[1]))+1;
			}
			sums.add(sum);
		}
		
	
	}
}