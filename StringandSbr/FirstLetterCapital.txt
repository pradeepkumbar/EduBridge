//program to convert the first letter to capital letter
import java.util.Scanner;

public class FirstLetterCap {

	//Declaring method to capitalize the first word
	public static String printCapitalized(String str)
	{
		//creating string buffer to append required string
		StringBuffer bff=new StringBuffer();
		//splitting string to get first letter
		String strs[]=str.split(" ");
		for (String a : strs)
		{
			int n=a.length();
			String s=a.substring(1,n);
			//converting first letter and appending
		    bff.append(a.substring(0,1).toUpperCase()).append(s).append(" ");
			}
		//returning string
		return bff.toString();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//asking the user to enter the string
		System.out.println("Enter the string");
		String str = sc.nextLine();
		//Calling method and printing the returned String
		System.out.println(printCapitalized(str));
	}

}
