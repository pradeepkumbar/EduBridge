//Programm to read Temprature in centigrade and display a suitable message.
import java.util.Scanner;

public class TempearaturePgm {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//Asking the user to enter the temperature in centigrade.
		System.out.println("Enter a Weather in centigrade");
		int temp=scan.nextInt();
		if(temp<0)
			//checking for the suitable condition and printing the message on to the console.
			System.out.println("It is freezing Weather");
		else if(temp>0 && temp<=10)
			System.out.println("It is very cold Weather");
		else if(temp>10 && temp<=20)
			System.out.println("It is cold Weather");
		else if(temp>20 && temp<=30)
			System.out.println("It is Normal Weather");
		else if(temp>30 && temp<=40)
			System.out.println("It is Hot Weather");
		else if(temp>=40)
			System.out.println("It is very Hot Weather");
		
	}

}
