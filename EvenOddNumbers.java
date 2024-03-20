package testngpractice;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class EvenOddNumbers {
	
	 @Test

	    public void practice() {


	int a[]= {12, 23, 34, 45, 56, 67, 78, 89,90};

	ArrayList <Integer> evenNum = new ArrayList<>();
	        ArrayList <Integer> oddNum = new ArrayList<>();
	for(int i=0; i<a.length; i++)
	{

	    if(a[i]%2==0)
	    {
	        evenNum.add(a[i]);
	      //  System.out.println(a[i] + " " + "is even number");

	    } else{ oddNum.add(a[i]);//System.out.println(a[i] + " " + "is odd number");}


	}


	    }System.out.println(evenNum);
	        System.out.println(oddNum);
	}



}
