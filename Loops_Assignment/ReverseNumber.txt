//Write a program that prompts the user to input an integer and then outputs 
//the number with the digits reversed.For example, if the input is 12345
//the output should be 54321.
import java.util.Scanner;
public class ReversNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number to Reverse");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int rev=0,rem,num;
		num=n;
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n/=10;
		}
		System.out.println("Original Number is "+num);
		System.out.println("Reverse Number is "+rev);
		

	}

}
