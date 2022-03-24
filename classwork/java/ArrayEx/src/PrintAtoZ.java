import java.util.Scanner;

public class PrintAtoZ {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Printing A to Z");
		//Assinging size of the char array to 26 
		char[] ch=new char[26];
		for(int i=0;i<ch.length;i++)
		{
			//converting number to ascii value of a character
			ch[i]=(char)('a'+i);
		}
		//printing the values using the for each loop
		for(char chr : ch)
		{
			System.out.print(chr+" ");
		}

	}

}
