// program to replace is to is not
import java.util.Scanner;

public class NagativeString {
	public static String negativeString(String str)
	{
		StringBuffer buff=new StringBuffer();
		String sts[]=str.split(" ");
		for(String s : sts)
		{
			if(s.equals("is"))
			{
				buff.append(" ").append("is not").append(" ");
			}
			else
			{
				buff.append(s);
			}
		}
			return buff.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		//asking the user to enter the string
		System.out.println("Enter the string");
		String str = sc.nextLine();
		//Calling method and printing the returned String
		System.out.println(negativeString(str));
	}

}
