package testngpractice;

import org.testng.annotations.Test;

public class EvenOddInt {
	
	@Test
	public void evenoddint() {
	
	int a= 98765432;
	int temp=a;
	int evenNum=0;
	int OddNum=0;
	
	
	while(temp>0)
	{
		int num=temp%10;
		
		if( num % 2 == 0)
		{
			
			evenNum++;
		}
		
		else {OddNum++;}
		
		temp=temp/10;
	}

	System.out.println(evenNum);
	System.out.println(OddNum);
}
}
