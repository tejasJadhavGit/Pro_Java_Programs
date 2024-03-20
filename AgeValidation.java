package testngpractice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.testng.annotations.Test;

public class AgeValidation {
	@Test
	public void age_Validation() throws ParseException, NotEligibleException
	{
		
		
	String 	dateOfBirthString = "02/03/2020";
	
	SimpleDateFormat format= new SimpleDateFormat("dd/MM/yyyy");
	Date dobformat = format.parse(dateOfBirthString);
	Calendar DateOfBirth= Calendar.getInstance();
	DateOfBirth.setTime(dobformat);
	 
	int BirthYear = DateOfBirth.get(Calendar.YEAR);
	Calendar ToaydsDate= Calendar.getInstance();
	
	int currentYear =ToaydsDate.get(Calendar.YEAR);
	
	int Curremtage=currentYear - BirthYear ;
	
		if (Curremtage > 18) {System.out.println("Customer is Eligible");}
		
		else {
			
			System.out.println("Customer is not Eligible");
			//throw new NotEligibleException ("Age is below 18 age");
			
			}
	}


}
