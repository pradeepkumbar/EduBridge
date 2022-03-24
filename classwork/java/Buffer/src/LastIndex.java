import java.util.Scanner;

public class LastIndex {
	
	public static void formString(String[] strs,int num)
	{
		StringBuffer buffer=new StringBuffer();
		
		buffer.append(strs);
		buffer.reverse();
		//buffer.
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//asking the user to enter the string
		System.out.println("Enter the string to replicate ");
		int n=sc.nextInt();
		String[] str=new String[n];
		for(int i=0;i<n;i++)
		{
			str[i]=sc.next();
		}
		
		//asking the user to enter the value of n
		System.out.println("Enter the How many times you want to Replicate");
		int num=sc.nextInt();
		formString(str,num);

	}

}
