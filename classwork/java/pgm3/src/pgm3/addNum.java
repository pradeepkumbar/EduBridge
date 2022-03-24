//ading three numbers
package pgm3;

public class addNum {

	public static int add(int a,int b,int c)
	{
		return a+b+c;
	}
	public static void main(String[] args) {
		

		int result;
		//calling the static add method
		result=add(4,8,9);
		System.out.println("Summation of three numbers is "+result);
	}
}
