package practice;

import java.util.Scanner;

class demo1{
	int counta,counte,counti,counto,countu;
	public int uniqueVowel(String str)
	{
		int n=str.length();
		for(int i=0;i<n;i++)
		{
			if(str.charAt(i)=='a' )
			{
				counta=1;
			}
			else if(str.charAt(i)=='e')
				{
				counte=1;
				}
			else if(str.charAt(i)=='i')
			{
				counti=1;
			}
			else if(str.charAt(i)=='o')
			{
				counto=1;
			}
			else if(str.charAt(i)=='u')
			{
				countu=1;
			}
			else
			{
				
			}
		}	
		return counta+counte+counti+counto+countu;
	}
public static void main(String[] args)
{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the string");
	String str=scan.next();
	demo1 demo=new demo1();
	System.out.println(demo.uniqueVowel(str));
		
	}
}