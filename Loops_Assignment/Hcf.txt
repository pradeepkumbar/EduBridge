//Write a program to calculate HCF of Two given number.
import java.util.Scanner;

public class FindHcf {

	public static void main(String[] args) {
		//Asking user to enter the two numbers to find HCF.
		System.out.println("Enter two numbers to find HCF");
		Scanner scan=new Scanner(System.in);
		//First value is stored in "num1".
		int num1=scan.nextInt();
		//Second value is stored in "num2".
		int num2=scan.nextInt();
		int hcf=0,i=1;
		for(;i<=num1 || i<=num2;i++)
		{
			if(num1%i==0 && num2%i==0)
			{
				hcf=i;
			}
		}
		//result is printing saying that HCF is: 
		System.out.println("HCF is "+hcf);

	}

}
