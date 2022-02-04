//program to check age 
import java.util.Scanner;

public class CheckAge {

	public static void main(String[] args) {
		System.out.println("Enter the  Age of Student to check ");
		Scanner scan=new Scanner(System.in);
		//taking age from user
		int age=scan.nextInt();
		//printing true/false
		System.out.println(age>=18);
	}

}
