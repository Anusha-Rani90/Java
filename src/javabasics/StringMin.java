package javabasics;

import java.util.Scanner;

public class StringMin {

	public static void main(String[] args) {
		String s[]= {"hello","hi","bye"};
		String min=s[0];
		for(int i=1;i<s.length;i++)
		{
			if(min.length()>s[i].length())
			{
				min=s[i];
			}
		}
		
		System.out.println("The min String is "+min);

	}

}
