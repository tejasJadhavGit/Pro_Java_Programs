package testngpractice;

import org.testng.annotations.Test;

public class oddEvenNumber {
	
	
	@Test
	
	public void oddEven()
	{
		
		int []a = {12, 7, 9, 93, 20, 29, 35, 2};
		
		
		for (int i=0; i<a.length; i++)
		{
			
		
				
		{	if(a[i] %2 == 0) 
				
			{ System.out.println(a[i] + " " + " is even Number" );
			}
			
			else
				
			{System.out.println(a[i] + " " + " is  odd Number" ); }
		}
		
		}
		
	}

}
