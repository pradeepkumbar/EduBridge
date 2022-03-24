import java.util.Scanner;

public class salaryPay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		float sal,hra,allowance,pf;
		sal=scan.nextFloat();
		//float hra;
		hra=(50.0f/100.0f)*sal;
		System.out.println(hra);
		//float allowance;
		allowance =(75.0f/100.0f)*sal;
		System.out.println(allowance);
		//float pf;
		pf=(12.0f/100.0f)*sal;
		System.out.println(pf);
		System.out.println((hra+allowance)-pf);
		
		}

}
