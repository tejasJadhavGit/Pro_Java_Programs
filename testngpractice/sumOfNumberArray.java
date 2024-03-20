package testngpractice;

import org.testng.annotations.Test;

public class sumOfNumberArray {

	
	@Test
	public void secHighNumber() 
	{
	
	int []a= { 1, 2, 10, 100, 235, 675, 543, 999};
				
	int sum= 0;
	for (int i=0; i<a.length; i++ )
	{
		sum = sum + a[i];
	}
	
	System.out.println(sum);
}
}