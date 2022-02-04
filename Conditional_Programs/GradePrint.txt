//program to accept a grade and declare the equivalent description.
import java.util.Scanner;

public class GradePrint {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a grade");
		char ch=scan.next().charAt(0);
		//asking user enter the Grade value.
		switch(ch)
		{
		//checking for the appropriate Grade using switch.
		case 'E':System.out.println("Excelent");
				 break;
		case 'V':System.out.println("VERY GOOD");
				 break;
		case 'G':System.out.println("GOOD");
				 break;
		case 'A':System.out.println("AVERAGE");
				 break;
		case 'F':System.out.println("FAIL");
				 break;
		//If the User enetred wrong choice then default value is print.		 
		default:System.out.println("Entered wrong choice");		 
		}
	}

}
