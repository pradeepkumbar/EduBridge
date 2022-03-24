import java.util.Scanner;

public class StringConcat {
	public static String getCombo(String str,String str1)
	{
		//declaring the string buffer to store the result
		StringBuffer buffer=new StringBuffer();
		//finding the lenth of the strings 
		int len=str.length();
		int len1=str1.length();
		//checking for the greater string to append, to get desired output
		if(len>len1)
		{
			buffer.append(str).append(str1).append(str);
		}
		else
			buffer.append(str1).append(str).append(str1);
		//returning the string with tostring methods
		return buffer.toString();
		
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		//asking the user to enter the first string
		System.out.println("Enter First string");
		String str=sc.next();
		//asking the user to enter the second string
		System.out.println("Enter second string");
		String str1=sc.next();
		//calling static method with argument 
		System.out.println(getCombo(str,str1));
	}

}
