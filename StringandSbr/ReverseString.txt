//program to Print middle characters of the even length string
import java.util.Scanner;
public class ReverseString {


		//Declaring getmiddlechar method tofind middle characters
		public static String getMiddleChars(String str)
		{
			//declaring string buffer to store middle characters
			StringBuffer sb=new StringBuffer();
			if(str.length()%2==0)
			{
				//appending string to string buffer
				sb.append(str.substring((str.length()/2)-1,(str.length()/2)+1));
			}
			else 
			{
				//informing the user you rae entered the odd length string
				System.out.println("Entered String is not even length ");
				System.exit(0);
			}
			return sb.toString();
		}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			//asking the user to enter the even length string
			System.out.println("Enter the even length string");
			String s = sc.nextLine();
			//Calling method and printing the returned String
			System.out.println(getMiddleChars(s));
		}
	


}

