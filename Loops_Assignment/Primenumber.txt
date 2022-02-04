import java.util.Scanner;
//Write a program that prompts the user to input a positive integer.
//It should then output a message indicating whether the number is a prime number.
public class PrimeNumber {

	public static void main(String[] args) {
		char x;
	do {
		System.out.println("Enter the Number to check for prime number");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int flag=0;
		
		for(int i=2;i<=(n/2);i++)
		{
			if(n%i==0)
			{
				System.out.println("Entered Number is not a prime Number");
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("Entered Number is a Prime Number");
		}
		System.out.println("Do You want Continue?");
		x=scan.next().charAt(0);
		
	}while(x=='Y' || x=='y');

	}

}
