//Read ineger value and display the number of days for this month
import java.util.Scanner;

public class DaysofMonth {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Month number" );
		//creating variable for asking user to enter no.of days
		int ch=scan.nextInt();
		switch(ch)
		{
		//start of switch case to check no. of days
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:	
		case 10:
		case 12:System.out.println("Month has 31 days");
				break;
		case 4:
		case 6:
		case 9:
		case 11:System.out.println("Month has 30 Days");
				break;
		case 2:System.out.println("Month 28/29 days");
				break;
		default:System.out.println("wrong choice");
		}

	}

}
