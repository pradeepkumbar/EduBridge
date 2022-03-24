//program to find the count of even and odd numbers using an array
import java.util.Scanner;

public class ArrayEvenandOdd {

	public static void main(String[] args) {
		int[] arr=new int[10];
		Scanner scan=new Scanner(System.in);
		int count=0,cnt=0;
		//asking the user to enter the array elements
		System.out.println("Enter the elements");
		for(int i=0;i<arr.length;i++)
		{
			
			arr[i]=scan.nextInt();
		}
		//checking the array element is odd or even
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				count++;
			}
			else
			{
				cnt++;
			}
		}
		//printing the count of odd and even numbers
		System.out.println("Count of Even number is: "+count);
		System.out.println("Count of odd number is: "+cnt);
	}

}
