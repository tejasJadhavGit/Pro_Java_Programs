package testngpractice;

import org.testng.annotations.Test;

public class digitsinNumber {
	
	
	
	
	@Test
	public void fibs()
	{
		
		{
			
			int n = 845098870;
			
			int num = 0;
			
		while(n!=0)
			{
				
				n=n/10;
				
				num= num + 1;
				
			}
			
			
System.out.println(num);
}
}
}