//program print special characters and and number from the string
import java.util.Scanner;

public class FlushChar {

	public static String getFlushch(String msg)
	{
		StringBuffer buffer=new StringBuffer();
		for(int i=0;i<msg.length();i++)
		{
			char a=msg.charAt(i);
			if(!Character.isAlphabetic(a))
			{
				buffer.append(a);
			}
		}
		return buffer.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		String msg;
		System.out.println("Enter the String");
		msg=sc.next();
		//FlushChar obj=new FlishChar();
		System.out.println(getFlushch(msg));
	}

}
