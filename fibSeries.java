package testngpractice;

import org.testng.annotations.Test;

public class fibSeries {
	
	
	

//@Test
public void fibseries() 
{


int num= 20;

int n1=0, n2=1, n3=0;

System.out.print(n1 + " " + n2);

for (int i=2; i<=num; i++ )
{
	
	n3=n1 + n2;
	
	System.out.print(" " + n3);
	
	n1=n2;
	n2=n3;
}




}
//@Test

static int fib(int n)
{
    // Base Case
    if (n <= 1)
        return n;

    // Recursive call
    return fib(n - 1) + fib(n - 2);
}

// Driver Code
public static void main(String args[])
{
    // Given Number N
    int N = 10;

    // Print the first N numbers
    for (int i = 0; i < N; i++) {

        System.out.print(fib(i) + " ");
    }
}



}