package pgm6;
import java.util.*;
public class Bank {
	 static int amount=0;

	public static void deposit(int n)
	{
		amount=amount+n;
		main(null);
	}
	public static void withdraw(int c)
	{
		amount=amount-c;
		main(null);
	}
	public static void check()
	{
		System.out.println("balance amount"+amount);
		main(null);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("1.Enter Amount to Deposit");
System.out.println("2.Enetr amount to Withdraw");
System.out.println("3.Check for Balace");
System.out.println("4.Exit");
Scanner sc=new Scanner(System.in);
int ch=sc.nextInt();
switch(ch)
{
case 1:int n=sc.nextInt();
	   deposit(n);
       break;
case 2:int c=sc.nextInt();
	   withdraw(c);
	   break;
case 3:check();
case 4:System.exit(0);
default : System.out.println(" ");
}
		
	}

}
