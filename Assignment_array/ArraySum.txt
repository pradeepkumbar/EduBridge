//program to find sum of array elements
import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array elements");
		int[] arr=new int[10];
		int sum=0;
		//asking the user to enter the enter the array elements 
		for(int i=0;i<10;i++)
		{
			arr[i]=scan.nextInt();
		}
		//finding the sum using the for loop and storing it into sum variable
		for(int i=0;i<10;i++)
		{
			sum=sum+arr[i];
		}
		//printing the output
		System.out.println("sum of array 10 elements: "+sum);

	}

}
