package testngpractice;

import org.testng.annotations.Test;

public class RevStringbutkeeporderSame {
	
	
	@Test
	
	public void revstring()
	{
		
		//input abc de 
		//Output = edc ba
		
		String orgStr= "abc de";
		
		char[]a= orgStr.toCharArray();
		
		String rev  = "" ;
		
		for(String lett:a)
		for (int i=lett.length()-1; i>=0; i--)
		{
			
			rev = rev + lett.charAt(i);
		}
		
		System.out.println(rev);
	}

}
