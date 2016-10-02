//How many times are letters repeated in a word.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Mississipi {

	public Mississipi() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[]args){
		
			Map<Character,Integer> count=new HashMap();
			
			Scanner sc=new Scanner(System.in);
			String s=sc.next();
			char[] charArray=s.toCharArray();
			
			
			for(char ch:charArray){
				//if key is already present, get the count and add 1
				int k=count.containsKey(ch)?count.get(ch):0;
				count.put(ch,k+1);
			}
		
		
			
		List<Integer> values=new ArrayList<>(count.values());
		System.out.println(count.keySet());
		System.out.print("[");
		for(int v:values){
			System.out.print(v+" ");
		}
			
		System.out.print("]");
		
	}
}
