//Write a program that reads a set of integers,
//and then prints the sum of the even and odd integers.
import java.util.Scanner;
public class SumofEvenOdd {

	public static void main(String[] args) {
		System.out.println("Enter the Total count of a number ");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		int sum=0,sum1=0,num;
		System.out.println("Enter the Numbers");
		for(int i=0;i<n;i++)
		{
			num=scan.nextInt();
			
			if(num%2==0)
			{
				sum=sum+num;
			}
			else
			{
				sum1=sum1+num;
		}
			
			}
		
		
		System.out.println("Sum of Even Numbers "+sum);
		System.out.println("Sum of Odd Numbers "+sum1);
		

}
}
