//Two numbers are entered through the keyboard. Write a program 
//to find the value of one number raised to the power of another. 
//(Do not use Java built-in method)
import java.util.Scanner;
public class ExponentionalofNum {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//Asking the user to enter the base value and store it into "num" variable.
		System.out.println("Enter Base NUmber");
		int num=scan.nextInt();
		//Asking the user to enter the power value and store it into "pow" variable.
		System.out.println("Enter Power value");
		int pow=scan.nextInt();
		int res=1;
		//Defining for loop to find value.
		for(int i=1;i<=pow;i++)
		{
			res=res*num;
		}
		//Printing the result in perfect manner.
		System.out.println(num+"^"+pow+"="+res);
	}

}
