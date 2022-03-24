import java.util.Scanner;

public class InsersionMethod {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the length of the array");
		int n=scan.nextInt();
		System.out.println("Enter the array elements");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=scan.nextInt();
		}
		System.out.println("Array Elenments Before sorting");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		SortInsertion sort=new SortInsertion();
		sort.insertionsort(a);
		System.out.println("Array elements after sorting");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");		}

	}

}
