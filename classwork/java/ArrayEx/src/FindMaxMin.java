//program to find maximum and minimum value using the array
import java.util.Scanner;

public class FindMaxMin {

	public static void main(String[] args) {
		System.out.println("Enter Integer number");
		Scanner scan=new Scanner(System.in);
		int[] arr=new int[6];
		int max,min;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		max=min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			else if(arr[i]<min)
			{
				
				min=arr[i];
			}
			else {
				
			}
		}
		System.out.println("Max Value is: "+max);
		System.out.println("Min Value is: "+min);
	}

}
