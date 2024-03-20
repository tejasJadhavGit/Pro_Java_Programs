package testngpractice;

import org.testng.annotations.Test;

public class secondHighestNumber {
	
	
	

	@Test
	public void secHighNumber() 
	{
	
		int []a= { 553, 12, 34, 90, 999, 1000, 89, 67, 100, 234, 554};
				
	int highnum= Integer.MIN_VALUE;
	int secHighNum= Integer.MIN_VALUE;
	
	
	for (int i=0; i<a.length; i++ )
	{
		
		if (a[i]> highnum)
		{
			
			secHighNum = highnum;
			
			highnum = a[i];
		}
		
		else {
		
			if(a[i]> secHighNum & a[i]!= highnum)
			{secHighNum = a[i];}
		
		}
	}
	
	System.out.println(secHighNum);
}
}