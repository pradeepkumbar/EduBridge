//Program for checking the entered year is Leap year or not.
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter year to check for leap year");
		//Asking user to enter the year and store it into "year" variable.
		int year=scan.nextInt();
		//Checking the entered year is leap year or not by dividing it by 4.
		if(year%4==0)
			System.out.println(+year+" is a leap year");
		//Checking the entered year is leap year or not by dividing it by 100.
		else if(year%100==0)
			System.out.println(+year+" is a leap year");
		//Checking the entered year is leap year or not by dividing it by 400.
		else if(year%400==0)
			System.out.println(+year+" is a leap year");
		//if it dose not dividing by any number above declaired then it is not a leap year.
		else
			System.out.println(+year+" is not a leap year");
		
	}

}
