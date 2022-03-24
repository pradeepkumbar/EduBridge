package practice;

import java.util.Scanner;

 class superclass {
	

	public static String retstring(String str)
	{
		return str;
	}
}
 class demo extends superclass{

	public static String retString(String str)
	{
		return str;
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine(); 
		System.out.println(superclass.retstring(str));
		System.out.println(demo.retString(str));
		//mo a=new demo(str);

	}
}
