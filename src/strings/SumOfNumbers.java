package strings;

public class SumOfNumbers {

	public static void main(String[] args) {
		String s="abc123@4$5654";
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
			//sum=sum+s.charAt(i);
				int n=s.charAt(i)-48;
				sum=sum+n;
		}
		}
		System.out.println(sum);
		
	}

}
