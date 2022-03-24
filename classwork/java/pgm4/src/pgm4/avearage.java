//finding the average values
package pgm4;

public class avearage {

	public static double avg(double a,double b,double c)
	{
		//finding average storing it into variable of double type and returning the value
		double result=(a+b+c)/3;
		return result;

	}
	public static void main(String[] args) {
		//calling the static method with double methods to find average		
		double c=avg(98.16,65.90,55.65);
		//printing the returned value
		System.out.println("Average of Three numbers is "+c);

	}
}
