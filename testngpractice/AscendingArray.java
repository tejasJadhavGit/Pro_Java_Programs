package testngpractice;

import org.testng.annotations.Test;

public class AscendingArray {
	
	@Test
	public void ascendingarray()
	{
		
		
		int a[]= {12,21,32,34,43,54,45,67,87,98, 10};
		
		
		for (int i=0; i<a.length; i++)
		{
			
			for (int j=i+1; j<a.length; j++)
				
			{
				int temp=0;
				
				if(a[i]>a[j])
				{
					
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
					
				}
				
				
			}
			System.out.println(a[i]);
		}
		
		
		
	}

}
