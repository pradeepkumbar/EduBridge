//Write a program to find the factorial value of any number entered through the keyboard. 
import java.util.Scanner;
public class FIndFactorial {

	public static void main(String[] args) {
		//Asking the user to enter the value to find Factorial.
		System.out.println("Enter a Number to Find Factorial");
		Scanner scan=new Scanner(System.in);
		double num=scan.nextDouble();
		double fact=1;
		//Finding factorial using for loop.
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		//printng result to console.
		System.out.println("Factorial of Number "+num+" is "+fact);
	}

}
