package testngpractice;

import org.testng.annotations.Test;

public class pallindom {

	
	@Test
	public void revnPalli()
	{
		
		{
			
			int a = 12345678;
			int orgNum = a;
			int rev = 0;
			
			
			while (a>0)
			{
				
				rev = rev * 10 + a% 10;
				a=a/10;
				
			}
			
			System.out.println(rev);
			
			if (rev == orgNum)
			{
				System.out.println(orgNum + " " + " is pallindrome");	
			
			}
			else {System.out.println(orgNum + " " + " is not pallindrome");}
}
}
}