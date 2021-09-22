package javabasics;

public class ReverseString {

	public static void main(String[] args) {
		String s="Today is Tuesday";
		String rev="";
		String[] s1=s.split(" ");
		
		for(int i=s1.length-1;i>=0;i--)
		{
			rev=rev+s1[i]+" ";
		}
		
		System.out.println("The reverse String is:" +rev);
		
		

	}

}
