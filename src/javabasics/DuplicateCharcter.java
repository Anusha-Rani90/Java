package javabasics;

import java.util.HashSet;

public class DuplicateCharcter {

	public static void main(String[] args) {
		HashSet<Character> set = new HashSet<Character>();
		String s="india";
		for(int i=0;i<=s.length()-1;i++)
		{
			set.add(s.charAt(i));
		}
		
		for(Character ch: set)
		{
			int count=0;
			for(int i=0;i<=s.length()-1;i++)
			{
				if(ch==s.charAt(i))
				{
					count++;
				}
				
				}
			if(count>1) {
				System.out.println(ch +" "+count);
			}
			
		}
		

	}

}
