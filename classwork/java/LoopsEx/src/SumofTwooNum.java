//Write a do-while loop that asks the user to enter two numbers. 
//The numbers should be added and the sum displayed.
//The loop should ask the user whether he or she wishes to perform the operation again.
//If so, the loop should repeat; otherwise it should terminate.
import java.util.Scanner;
public class SumofTwooNum {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		char x;
		do {
			System.out.println("Enter the Two numbers");

			int a=scan.nextInt();
			int b=scan.nextInt();
			System.out.println("The Sum of Two numbers is "+(a+b));
			System.out.println("Do You want to continue Adding?");
			x=scan.next().charAt(0);
		}while(x=='y' || x=='Y');

	}

}
