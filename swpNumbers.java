package testngpractice;

import org.testng.annotations.Test;

public class swpNumbers {
	
@Test
	
	public void swaping()
	{
		
		int a = 12; 
		int b = 30;
		
	 a = b + a ; //42
	 b = a-b; // 12
	 a = a-b; // 30
	 
	 System.out.println(a + " "+ b);
		

}
}