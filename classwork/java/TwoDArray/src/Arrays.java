import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		float arr[][]=new float[3][5];
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("Enter the hight of class: "+i+" player: "+j);
				arr[i][j]=scan.nextFloat();
			}
		}
		System.out.println("Array content is :");
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println(arr[i][j]);			}
		}

	}

}
