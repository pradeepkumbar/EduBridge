//program to check the entered value is even or odd 
import java.util.Scanner;

public class Checkevenodd {

	public static void main(String[] args) {
		//asking the user to enter the number to check even or odd
		System.out.println("Enter a number to check Even or Odd");
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		//printing the tru/false
		System.out.println((num%2)==0);
		

	}

}
