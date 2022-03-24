//programm to check whether the entered character is symbol or number or special character
import java.util.Scanner;

public class FindSymbol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter value to check");
		//creating variable to check symbol or number or special char
		char ch=scan.next().charAt(0);
		switch(ch)
		{
		//Checking the entered value is number 
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':System.out.println("Entered value is Number");
		break;
		//Checking entered value is Alphabet  
		case 'a':
		case 'b':
		case 'c':
		case 'd':
		case 'e':
		case 'f':
		case 'g':
		case 'h':	
		case 'i':
		case 'j':
		case 'k':
		case 'l':
		case 'm':
		case 'n':
		case 'o':
		case 'p':
		case 'q':
		case 'r':
		case 's':
		case 't':
		case 'u':	
		case 'v':
		case 'w':
		case 'x':
		case 'y':
		case 'z':System.out.println("Entered Charecter");
		break;
		//Checking for Special character
		case '!':
		case '@':
		case '#':
		case '$':
		case '%':
		case '^':
		case '&':
		case '*':System.out.println("Entered special Character");
		break;
		//if user Enter the wrong choice then default statement is executed
		default:System.out.println("Entered wrong character");

		}
	}

}
