//program to find average of integer values
import java.util.Scanner;

public class AVerageValue {

	public static void main(String[] args) {
		System.out.println("Enter size of an array to calculate Average");
		//asking the user enter the size of an integer
		Scanner scan=new Scanner(System.in);
		int size=scan.nextInt();
		float[] arr=new float[size];
		float sum=0;
		for(int i=0;i<arr.length;i++)
		{
			//assigning the values to array
			arr[i]=scan.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			//calculating the sum
			sum=sum+arr[i];
		}
		//finding the average using formulae
		float avg=sum/(float)size;
		System.out.println("Average of an integer array is : "+avg);
	}

}
