package strings;

import java.util.Scanner;

public class ReverseingString {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=scan.next();
		//String s="India";
		String reverse="";
		for(int i=s.length()-1;i>=0;i--)
		{
			reverse=reverse+s.charAt(i);
			System.out.println(s.charAt(i));
		}
		System.out.println("Thr Reverse of the string hello is "+reverse);
		
	}

}
