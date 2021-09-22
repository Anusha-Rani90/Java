package strings;

public class RevString {

	public static void main(String[] args) {
		String s="India";
		int count =0;
		char[] c = s.toCharArray();
		for(char ch  :c)
		{
			count++;
		}
		
		System.out.println(count);
		String rev="";
		for(int i=count-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println("The reverse string is "+rev);
	}

}
