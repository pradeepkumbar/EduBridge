//String Replication based on the user input string replication is done. 

import java.util.Scanner;

public class Replica {
	public static String repeatString(String strs,int num)
	{
		//creating string buffer to store replicated string
		StringBuffer buffer=new StringBuffer();
		for(int i=0;i<num;i++)
		{
			//append method is used replicate the string
			buffer.append(strs+" ");
		}
		//returning the replicated string to main 
		return buffer.toString();
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//asking the user to enter the string
		System.out.println("Enter the string to replicate ");
		String str=sc.next();
		//asking the user to enter the value of n
		System.out.println("Enter the How many times you want to Replicate");
		int n=sc.nextInt();
		//calling the repeat string method and printing the returned replicated string 
		System.out.println(repeatString(str,n));

	}

	
}
