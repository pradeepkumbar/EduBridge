//Name Shrinking
import java.util.Scanner;
import java.lang.String;
public class NameShrinking {
	//defining method to convert method into required output
	public static String getFormatedString(String str)
	{
		//declaring two buffers to store the string
		StringBuffer buff=new StringBuffer();
		StringBuffer buff1=new StringBuffer();
		//splitting string
		String st[]=str.split(" ");

		int n=0;//declaring enhanced for loop
		for(String s : st)
		{
			//to take first two names we use if condition
			if(n<2)
			{
				//appending string in required form
				buff.append(s.charAt(0)).append(".");
				n++;
			}
			else
				//append the last string
				buff1.append(s);
		}
		//reverse the string
		buff.reverse();
		//Retrning the string to main method to print the string
		return buff1.append(buff).toString();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//asking the user to enter the string
		System.out.println("Enter the string");
		String str = sc.nextLine();
		//Calling method and printing the returned String
		System.out.println(getFormatedString(str));

	}

}
