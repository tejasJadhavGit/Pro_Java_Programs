package testngpractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

public class occurenceletter {

	
	@Test
	
	public void letocc()
	{
		
		String name = "aaaassssdddjfffgghhjjhh";
		
		//Integer count = 1;
		

		Map < Character, Integer> map= new HashMap<>();
		
	for (int i=0; i<=name.length()-1; i++)
	{
		
		if (map.containsKey(name.charAt(i)))
			
		{
			int count = map.get(name.charAt(i));  
			map.put(name.charAt(i), ++count);  
			
		}
		
		else {map.put(name.charAt(i), 1);}
			
	}
		
		
	System.out.println(map);
	
	
}
}