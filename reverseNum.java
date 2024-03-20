package testngpractice;

import org.testng.annotations.Test;

public class reverseNum {
	
	
	@Test
	public void revn()
	{
		
		{
			
			int a = 12345678;
			int temp = a;
			int rev = 0 ;
			
			while (a>0)
			{
				
			rev = rev * 10 + a % 10 ;
			a=a/10;
			}
			
			System.out.println(rev);
}
}
}