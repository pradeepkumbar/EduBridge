import java.util.Scanner;

public class EmployeeName {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str[][]=new String[4][4];
		for(int i=0;i<=str.length-1;i++)
		{
			for (int j=0;j<=str[i].length-1;j++)
			{
				System.out.println("Enter the Employee of: "+i+" Name: "+j);
				str[i][j]=scan.next();
			}
		}
		
		for(int i=0;i<=str.length-1;i++)
		{
			for (int j=0;j<=str[i].length-1;j++)
			{
				System.out.println("Array Content is "+str[i][j]);
				
			}
		}
		
	}

}
