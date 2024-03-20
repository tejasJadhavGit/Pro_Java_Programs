package testngpractice;

import org.testng.annotations.Test;

public class highestNumber {
	
	
	@Test
	public void secHighNumber() 
	{
	
	int []a = {12, 23, 45, 67};
	
	int firstHigh = 0;
	

	for (int i=0; i<=a.length-1; i++)
	{
		
		if (a[i]> firstHigh)
		{
			
			 firstHigh =a[i];
		
		}
		
	}
	System.out.println(firstHigh);
	}
	}
