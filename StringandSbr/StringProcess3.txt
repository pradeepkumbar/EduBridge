//program to separate capital letters and small letters
import java.util.Scanner;

public class StringProces {
	//calling string move method to get desired out put
	public static String moveX(String str)
	{
		//creating to buffer to strore upper case and lower case values separately
		StringBuffer buf1=new StringBuffer();
		StringBuffer buf2=new StringBuffer();
		//iterating string to separate
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				//appending upper case value
				buf1.append(ch);
			}
			else
			{
				//appending lower case values
				buf2.append(ch);
			}


		}
		//appending two buffer to get required output
		return buf1.append(buf2).toString();

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//asking the user to enter the string
		System.out.println("Enter the string");
		String s = sc.nextLine();
		//Calling method and printing the returned String
		System.out.println(moveX(s));

	}

}
