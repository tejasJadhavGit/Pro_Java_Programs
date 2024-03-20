package testngpractice;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class practice {

	
	//@Test
	public void suOfArray() {

		int a[] = { 12, 2, 65, 45, 32 };

		int sum = 0;

		for (int i = 0; i < a.length; i++) {

			sum = sum + a[i];
		}
		System.out.println(sum);
	}
	
//@Test
	public void digitsInNumber() 
	{
		
		int num = 1234567890;
		
		int digit = 0;
		
		while (num !=0)
		{
			
			num = num / 10;
			
			digit = digit + 1;
			
		}
		
		System.out.println(digit);
		
	}
	
//@Test
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





//@Test
public void fact() 
{


int num = 10; //5*4*3*2*1

int fact = 1;


for (int i=1; i<=num; i++)
{
	
	
	fact = fact * i;
	//System.out.println(fact);
}


System.out.println(fact);

}


@Test
public void fibseries() 
{


int num = 10;


int n=0, n1=1, n2=2;






}

//@Test

public void highnumber()
{
	
	int []a= {12, 34000, 23, 21, 876, 568 , 8634, 2345};
	
	int highnum=0;
	
	for (int i=0; i<a.length; i ++)
	{
		
		if(a[i]>highnum)
		{
			highnum= a[i];
		}
	}
	System.out.println(highnum);
	
}

@Test

public void sechighnumber()
{
	int []a= {12, 34000, 23, 21, 876, 568 , 86340, 2345};
	
	int highnum= Integer.MIN_VALUE;
	int secHigh= Integer.MIN_VALUE;
	
	for (int i=0; i<=a.length-1; i++)
	{
		
		if(a[i]>highnum)
		{
			secHigh = highnum;
			highnum= a[i];
		}
		
		else {
			
			if(a[i]>secHigh & a[i]!=highnum)
				
			{
				secHigh = a[i];
				
			}
		}
		
	}
	System.out.println(secHigh);
}

@Test

public void occrlett()
{
	
String name= " i am from india";

String a[] = name.split("");

Map <String, Integer> occlett= new HashMap <> ();

for(String lett:a)
{
	
	
	if(occlett.containsKey(lett))
	{
		
		occlett.put(lett, occlett.get(lett) + 1);
	}
	else {occlett.put(lett,  1);}
	
}
System.out.println(occlett);
}
}












