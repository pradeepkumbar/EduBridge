//program to reverse an array
import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		//creating two arrays one array to store integer values from the user and 
		//another one to reverse the entered integer values.
		int[] arr=new int[6];
		int[] arr1=new int[6];
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the elements to reverse");
		for(int i=0;i<arr.length;i++)
		{
			//storing the user entered values
			arr[i]=scan.nextInt();
		}
		int j=6;
		
		for(int i=0;i<arr.length;i++)
		{
			//reversing the array
			arr1[j-1]=arr[i];
			j=j-1;
		}
			
		//printing the array using for each loop
		for(int array : arr1)
		{
			System.out.println(array);
		}
	}

}
