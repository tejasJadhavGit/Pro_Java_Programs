package testngpractice;

import org.testng.annotations.Test;

public class factorial {
	
	
	@Test
	public void fibs()
	{
		
		{
			
			int n = 8;
			
			int n1=0, n2=1, n3=0;
			
			System.out.print(n1 + " "+ n2);
			
			
			for (int i=2; i<n; i++)
			
			{
				
			n3 = n1 + n2 ;
			
					System.out.print (" " + n3);
			
					
			n1=n2;
			n2=n3;
			}
				
				
				
			}
			
}
}

