package testngpractice;

import org.testng.annotations.Test;

public class reversestring {
	
@Test
	
	public void revstr()
	{
		
		String name = "My my name is tejas my name";
		
		String []a= name.toLowerCase().trim().split(" ");
		String rev = "";
		
		for (String lett:a)
		for (int i=lett.length()-1; i>=0; i--)
		{
		
			rev= rev + lett.charAt(i);
			
			
		
		
		}
		System.out.println(rev);
		
		
	}
}
