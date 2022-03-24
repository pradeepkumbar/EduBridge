//program to Adding two array elements of size 5
import java.util.Scanner;

public class AddArray {

	public static void main(String[] args) {
		//declaring the two arrays of same size
		int[] arr=new int[5];
		int[] arr1=new int[5];
		Scanner scan=new Scanner(System.in);
		//asking the user to enter the array elements
		System.out.println("Enter the First array elements");
		for(int i=0;i<arr.length;i++)
		{
			
			arr[i]=scan.nextInt();
		}
		//asking the user to enter the second array elements
		System.out.println("Enter the Second array elements");
		for(int i=0;i<arr1.length;i++)
		{
			
			arr1[i]=scan.nextInt();
		}
		//adding the two arrays and storing it in one array using the single for loop
		for(int j=0, i=0;i<arr.length;j++,i++)
		{
			if(j<arr1.length)
			{
				
			arr[i]=arr[i]+arr1[j];
			}
		}
		System.out.println("Array elements after adding ");
		//printing the resultant array using the for each loop
		for(int array:arr)
		{
			System.out.println(+array);
		}
	}

}
