package testngpractice;

public class primenumber {

	
	public void primeNum()
	{
		
		{
			
			int []a = {12, 7, 9, 93, 20, 29, 35, 2};
			
			
			for (int i=0; i<a.length; i++)
			{
				
			for (int j=2; j<=a[i]; j++)
					
			{	if(a[i] %j == 0) 
					
				{ System.out.println(a[i] + " " + " is prime Number" );
				break;}
				
				else
					
				{System.out.println(a[i] + " " + " is not prime Number" ); break;}
			}
			
			}
			
		}

	}}
