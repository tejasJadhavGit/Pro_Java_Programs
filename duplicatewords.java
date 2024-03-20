package testngpractice;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class duplicatewords {
	
	@Test
	
	public void duplicateletters()
	{
		
		String name = "My my name is tejas my name";
		
		String []a = name.toLowerCase().trim().split("");
		
		
		
		Map <String, Integer> dpletter= new HashMap<>();
		
		for (String lett:a)
		{
			
			if (dpletter.containsKey(lett))
			{
				
				dpletter.put(lett, dpletter.get(lett)+ 1);
			}
			
			else {
				
				dpletter.put(lett, 1);
			}
		}
		
		
		
		
	
	for( Map.Entry b: dpletter.entrySet() )
	
	{
		
		
		int val = (Integer)b.getValue();
	}
	
	

	System.out.print(dpletter);
	
	}
	
//	@Test
	public void duplicateWords() 
	{
		
		String name = "I Am from India";
		String a[] = name.toLowerCase().split("");
		
		Map <String, Integer> dplett = new HashMap<> (); 
		
		for(String lett:a)
		{
		
		if(dplett.containsKey(lett))
		{
			
			dplett.put(lett, dplett.get(lett) + 1 );
		}
			
		else { dplett.put(lett, 1 );}
			
			
		}
		
		System.out.println(dplett);
	}

}
