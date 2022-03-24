//Program to REverse SubString for given original String
import java.util.Scanner;

public class ReverseSubString {

	//defining the method to reverse substring
	public static String reverseSubstring(String str,int m,int n)
	{
		//buffer is used to reverse string
		StringBuffer buff=new StringBuffer(str);
		buff.reverse();//reverse a given string
		//assigning reverse string to string 
		str=buff.toString();
		//returning the substring
		return str.substring(m,m+n);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//asking the user to enter the string
		System.out.println("Enter the string");
		String str = sc.next();
		//enter the staring position of string to extract substring
		System.out.println("Enter the starting position");
		int m=sc.nextInt();
		//enter how many characters
		System.out.println("Enter the lenght of the string you want to print");
		int n=sc.nextInt();
		//Calling method and printing the returned String
		System.out.println(reverseSubstring(str,m,n));
	}

}
