package javabasics;

public class StringMax {

	public static void main(String[] args) {
		String s[]= {"hi","who","bye"};
		String max=s[0];
		for(int i=1;i<s.length;i++)
		{
			if(max.length()==s[i].length())
			{
				System.out.println(s[i]);
			}
		
			if(max.length()<s[i].length())
			{
			
				max=s[i];
			}
		}
		
		
		System.out.println(max);

	}


	}


