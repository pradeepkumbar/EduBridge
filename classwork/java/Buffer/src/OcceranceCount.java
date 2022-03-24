//Program to count the required word from the entered string
import java.util.Scanner;

public class OcceranceCount {

	//Declaring  static variable to count the word
	static int count=0;
	//defining method to find the count
	public static int countWords(String str,String sss)
	{
		//splitting world to check word 
		String strs[]=str.split(" ");
		for(String s : strs)
		{
			if(s.equals(sss))
			{
				//if condition is true then count is incresed to 1
				count++;
			}
		}
		//returning the world count
		return count;
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//asking the user to enter the string
		System.out.println("Enter the string");
		String str = sc.nextLine();
		//asking the user to enter the word to find
		System.out.println("Enter the word to find");
		String sss=sc.next();
		//Calling method and printing the returned int value
		System.out.println(countWords(str,sss));

	}

}
