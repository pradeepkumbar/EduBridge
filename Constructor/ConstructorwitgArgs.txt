//Iimplementing Constructor With argument and  Without Argument Constructor 
import java.util.*;
public class Withargument {
	//Declaring Member variable of String Type
	String string;
	//Constructor with argument
	public Withargument(String str)
	{
		System.out.println("User Enetred this String  :"+str);
	}
	//Constructor with no Argument  
	public Withargument()
	{
		string="Wellcome to Java Programming";
	}
	void display()
	{
		System.out.println(string);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
       String str=sc.nextLine();
       //Creating object and passing string as argument
       Withargument withargument = new Withargument(str);
     //Creating object and passing no argument 
       Withargument ref = new Withargument();
       //Calling display method using ref object
       ref.display();
       
	}

}
