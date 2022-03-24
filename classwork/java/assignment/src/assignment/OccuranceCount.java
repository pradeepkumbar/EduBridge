//Program to count occurrence of yhe specified character 
package assignment;

import java.util.Scanner;

public class OccuranceCount {
	

	public static void main(String[] args) {
		

		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter the String");
			String str=scan.nextLine();
			System.out.println("enter the character to count the occurrence");
			char ch=scan.next().charAt(0);
			int count=0;
			for(int i=0;i<str.length();i++)
			{
				if(str.charAt(i)==ch)
				{
					count++;
				}
			}
			System.out.println("Count of entered character is: "+count);
		}
	}

}
