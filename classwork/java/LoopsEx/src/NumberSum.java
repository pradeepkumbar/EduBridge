//Program to find sum of 1-10 value using loops.
public class NumberSum {

	public static void main(String[] args) {
		System.out.println("Sum of first 10 Numbers");
		int sum=0;
		//for loop is to add the all elements one by one.
		for(int i=1;i<=10;i++)
		{
			//sum is stored in "sum" variable.
			sum=sum+i;
			
		}
		//printing sum of first 10 digits.
		System.out.println("Sum of First 10 Numbers is "+sum);

	}

}
