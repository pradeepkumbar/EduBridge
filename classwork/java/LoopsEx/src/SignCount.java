//Write a program to enter the numbers till the user wants and at the end 
//it should display the count of positive, negative and zeros entered. 
import java.util.Scanner;
public class SignCount {

	public static void main(String[] args) {
		//Declaring the required variables to count the +ve, -ve and Zero numbers 
		int cnt1=0,cnt2=0,cnt=0,num;
		Scanner scan=new Scanner(System.in);
		char x;
		do{
			System.out.println("Enter the number");
			//asking the user to enter the number
			num=scan.nextInt();
			//checking for positive number
			if(num>0)
			{
				cnt1++;
			}
			//checking for the -ve number
			else if(num<0)
			{
				cnt2++;
			}
			//else it is equal to zero
			else 
			{
				cnt++;		
			}
			//asking the user to continue or end the program
			System.out.println("Do You want Continue(y/n)?");
			x=scan.next().charAt(0);

		}while(x=='Y' || x=='y');

		//printing the respective counts.
		System.out.println("Count of Zero Numbers "+cnt);
		System.out.println("Count of Positive Numbers "+cnt1);
		System.out.println("Count of Nagative Numbers "+cnt2);


	}

}
