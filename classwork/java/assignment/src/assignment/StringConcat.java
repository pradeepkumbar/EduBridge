//concatenate givenstring with itself
package assignment;

import java.util.Scanner;

public class StringConcat {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//asking the user to enter the string
		System.out.println("Enter the String ");
		String str=scan.nextLine();
		//Asking the user to enter the value howw many times you want to concatenate
		System.out.println("How many Times You want concat?");
		int n=scan.nextInt();
		//declaring the buffer to add a string
		StringBuffer buffer=new StringBuffer();
		//for loop to cancatenate string
		for(int i=0;i<n;i++)
		{
			//cancatenating the string
			buffer.append(str).append(" ");
		}
		//printing the result
		System.out.println("Resulted String is: "+buffer);
	}

}
