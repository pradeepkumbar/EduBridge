//program to checking equality of two numbers 
import java.util.Scanner;

public class CheckforEquality {

	public static void main(String[] args) {
		//asking the user to enter the two numbers 
		System.out.println("Enter two Numbers to Check for Equality");
		Scanner scan=new Scanner(System.in);
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		//printing true/false 
		System.out.println(num1==num2);
	}

}
