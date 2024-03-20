package testngpractice;

import org.testng.annotations.Test;

public class removeSpaceFromArray {

	
@Test
	
	public void revstr()
	{
		
		String name = "My my name is tejas my name";
		
		
		String noSpace=name.replaceAll(" ", "");
		
		System.out.print(noSpace);
		
		
	}
}
