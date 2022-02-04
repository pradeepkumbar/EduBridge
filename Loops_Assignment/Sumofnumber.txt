//Write a program that prompts the user to input a positive integer.
//It should then print the multiplication table of that number. 
import java.util.Scanner;
public class MultiplicationTable {

	public static void main(String[] args) {
		//Asking user to enter the number to display and storing it in "n" variable.
		System.out.println("Enter a Number");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int i=1,multi=1;
		for(;i<=10;)
		{
			multi=n*i;
			//printing Output in very understanding manner.
			System.out.println(n+"x"+i+"="+multi);
			i++;
		}

	}

}
