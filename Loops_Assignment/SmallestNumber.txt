//Write a program to enter the numbers till the user wants 
//and at the end the program should display the largest and smallest numbers entered.
import java.util.Scanner;
public class SmallestGreatest {

	public static void main(String[] args) {
		System.out.println("Enter the numbers");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int num,smallnum=0,largenum=0;
		for(int i=0;i<n;i++)
		{
			num=scan.nextInt();
			if(num>largenum) {
				largenum=num;
			}
			if(num<smallnum)
			{
				smallnum=num;
			}
			
			
		}
		System.out.println("Largest number "+largenum);
		System.out.println("Smallest number "+smallnum);
		
	}

}
