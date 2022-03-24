//Programm to find the day of the week.
import java.util.Scanner;

public class NumberOfDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		//asking user to enter the number of the day in a week.
		System.out.println("Enter a Day");
		int ch=scan.nextInt();
		switch(ch)
		{
		//Checking for the right choice and printing the respective output.
		case 1:System.out.println("Monday");
			   break;
		case 2:System.out.println("Tuesday");
		   break;
		case 3:System.out.println("Wednesday");
		   break;
		case 4:System.out.println("Thursday");
		   break;
		case 5:System.out.println("Friday");
		   break;
		case 6:System.out.println("Saturday");
		   break; 
		case 7:System.out.println("Sunday");
		   break;
		  //if the user enter the wrong choice then default statement is going to print. 
		default :System.out.println("Wrong choice");	
		}
	}

}
