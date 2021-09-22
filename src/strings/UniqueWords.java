package strings;

import java.util.LinkedHashSet;

public class UniqueWords {

	public static void main(String[] args) {
		String s="welcome to tyss tyss";
		String[] str=s.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		for(int i=0;i<str.length;i++)
		{
			set.add(str[i]);
		}
		for(String word:set)
		{
			int count=0;
			for(int i=0;i<str.length;i++)
			{
				if(word.equals(str[i]))
				{
					count++;
					
				}
			}
			if(count==1)
			{
		
		System.out.print(word+" ");
			}
	}


	}

}
